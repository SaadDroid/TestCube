public Object dispatch(Object... params)
            throws IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        if (params.length != 1 + methodSignature.length) {
            throw new IllegalArgumentException("Expected " + methodSignature.length + " parameters");
        }

        Class<?> type = params[0].getClass();
        Target target = findTarget(type);
        return target.process(params);
    }
