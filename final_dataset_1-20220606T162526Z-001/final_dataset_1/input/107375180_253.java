@Override
    @SuppressWarnings("unchecked")
    public <V> V pull(Aspect<V> aspect) {
        if (aspect.isValuePresent()) {
            throw new IllegalStateException(String
                    .format("Static aspect %s should not be handled by %s. It seems like the dispatcher chain is broken, check your %s",
                            aspect, getClass().getSimpleName(), BindingContext.class.getSimpleName()));
        }
        @CheckForNull
        Object boundObject = getBoundObject();
        String propertyAspectName = getPropertyAspectName(aspect);
        if (boundObject != null && hasReadMethod(propertyAspectName)) {
            PropertyAccessor<Object, V> accessor = (PropertyAccessor<Object, V>)getAccessor(propertyAspectName);
            return accessor.getPropertyValue(boundObject);
        } else {
            return fallbackDispatcher.pull(aspect);
        }
    }
