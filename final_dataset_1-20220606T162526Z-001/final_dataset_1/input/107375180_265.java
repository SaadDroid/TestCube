@Override
    public <V> void push(Aspect<V> aspect) {
        @CheckForNull
        Object boundObject = getBoundObject();
        if (boundObject != null) {
            if (aspect.isValuePresent()) {
                callSetter(aspect);
            } else {
                invoke(aspect);
            }
        }
    }
