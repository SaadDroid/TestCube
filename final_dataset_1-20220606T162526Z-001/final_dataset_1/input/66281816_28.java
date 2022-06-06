@Override
    protected Object handleInvocation(final Object proxy, final Method method, final Object[] args)
            throws Throwable {

        //noinspection TryWithIdenticalCatches
        try {
            // If the method is a method from Object then defer to normal invocation.
            final Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass == Object.class) {
                return method.invoke(this, args);
            }

            // always call methods with zero arguments
            if (args == null || args.length == 0) {
                return method.invoke(mView, args);
            }

            // only void methods support distinctUntilChanged
            if (!method.getReturnType().equals(Void.TYPE)) {
                return method.invoke(mView, args);
            }

            // @DistinctUntilChanged is only valid on methods of the view interface extending View
            if (!TiView.class.isAssignableFrom(declaringClass)) {
                return method.invoke(mView, args);
            }

            final DistinctUntilChanged ducAnnotation =
                    method.getAnnotation(DistinctUntilChanged.class);

            // check if method is correct annotated
            if (ducAnnotation == null) {
                return method.invoke(mView, args);
            }

            final String methodName = method.toGenericString();

            final DistinctComparator comparator = mLatestMethodCalls.get(methodName);
            if (comparator == null) {
                // detected first call to method

                // initialize a new comparator defined by the annotation
                DistinctComparator newComparator = ducAnnotation.comparator().newInstance();

                // initialize the comparator with the already called parameters
                // the comparator is now able to compare this call with the next one
                if (newComparator.compareWith(args)) {
                    // when initializing the comparator with the first call it cannot return true
                    // which would mean the first call is the same as the previous call which
                    // never happened
                    throw new IllegalStateException("comparator returns 'true' at initialization.");
                }
                // save for later usage
                mLatestMethodCalls.put(methodName, newComparator);

                // it's the first call to this method, call it
                return method.invoke(mView, args);
            }

            // compare with last called arguments
            if (!comparator.compareWith(args)) {
                // arguments changed, call the method
                return method.invoke(mView, args);
            } else {
                // don't call the method, the data was already sent to the view
                if (ducAnnotation.logDropped()) {
                    TiLog.d(TAG, "not calling " + method
                            + " with args " + Arrays.toString(args) + "."
                            + " Was already called with the same parameters before.");
                }
                return null;
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
            throw e.getCause();
        } catch (IllegalAccessException e) {
            throw e;
        }
    }
