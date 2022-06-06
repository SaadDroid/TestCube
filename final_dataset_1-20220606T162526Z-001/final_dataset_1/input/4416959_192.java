public Object[] collectPageActivationContext(String pageName)
    {
        Boolean hasHandler = cache.get(pageName);

        if (hasHandler == null)
        {
            ComponentModel model = modelSource.getPageModel(pageName);

            hasHandler = model.handlesEvent(EventConstants.PASSIVATE);

            cache.put(pageName, hasHandler);
        }

        // If no handler for the event, then no need to fire the event (and more importantly,
        // no need to obtain a page instance!)

        if (!hasHandler)
            return EMPTY;

        // Get or create a page instance and trigger the event.

        Page page = requestPageCache.get(pageName);

        ComponentPageElement element = page.getRootElement();

        final Holder<Object[]> holder = Holder.create();

        ComponentEventCallback callback = new ComponentEventCallback()
        {
            public boolean handleResult(Object result)
            {
                holder.put(typeCoercer.coerce(result, Object[].class));

                // We've got the value, stop the event.

                return true;
            }
        };

        element.triggerEvent(EventConstants.PASSIVATE, null, callback);

        if (!holder.hasValue()) return EMPTY;

        return holder.get();
    }
