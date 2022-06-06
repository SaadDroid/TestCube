@Override
    public <T> T unwrap(Class<T> clazz) {
        return HttpServerRequest.class.isAssignableFrom(clazz) ? clazz.cast(request) : null;
    }
