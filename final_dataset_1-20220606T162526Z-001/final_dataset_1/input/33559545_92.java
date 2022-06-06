@Override
    public <T> T getForObject(final String url, final Class<T> responseType, final Object... uriVariables) {
        return getForEntity(url, responseType, uriVariables).getBody();
    }
