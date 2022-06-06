@Override
    public Handler createUiUpdater(PropertyDispatcher propertyDispatcher, ComponentWrapper componentWrapper) {
        Consumer<V> setter = createComponentValueSetter(componentWrapper);
        Aspect<V> aspect = createAspect();
        return () -> {
            try {
                setter.accept(propertyDispatcher.pull(aspect));
                // CSOFF: IllegalCatch
            } catch (RuntimeException e) {
                handleUiUpdateException(e, propertyDispatcher, aspect);
                // CSON: IllegalCatch
            }
        };
    }
