public Object invoke(Object[] arguments) {
        try {
            return new MethodInterceptorIterator(arguments).proceed();
        } catch (Throwable e) {
            throw new TransfuseInjectionException("Error while invoking Method Interceptor", e);
        }
    }
