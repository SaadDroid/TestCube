@Override
    public T havingBodyEqualTo(final String requestBody) {
        Validate.notNull(requestBody, "requestBody cannot be null, use an empty string instead");
        
        return havingBody(equalTo(requestBody));
    }
