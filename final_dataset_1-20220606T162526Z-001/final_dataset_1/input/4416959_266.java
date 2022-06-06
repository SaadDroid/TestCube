@SuppressWarnings({"unchecked", "rawtypes"})
    protected Object[] formExceptionContext(Throwable exception)
    {
        if (exception instanceof ContextAwareException) return ((ContextAwareException) exception).getContext();

        Class exceptionClass = exception.getClass();
        // pick the first class in the hierarchy that's not anonymous, probably no reason check for array types
        while ("".equals(exceptionClass.getSimpleName()))
            exceptionClass = exceptionClass.getSuperclass();

        // check if exception type is plain runtimeException - yes, we really want the test to be this way
        if (exceptionClass.isAssignableFrom(RuntimeException.class))
            return exception.getMessage() == null ? new Object[0] : new Object[]{exception.getMessage().toLowerCase()};

        // otherwise, form the context from the exception type name
        String exceptionType = exceptionClass.getSimpleName();
        if (exceptionType.endsWith("Exception")) exceptionType = exceptionType.substring(0, exceptionType.length() - 9);
        return new Object[]{exceptionType.toLowerCase()};
    }
