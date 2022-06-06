@Override
    public T havingMethodEqualTo(final String method) {
        Validate.notEmpty(method, "method cannot be empty");
        
        return havingMethod(equalToIgnoringCase(method));
    }
