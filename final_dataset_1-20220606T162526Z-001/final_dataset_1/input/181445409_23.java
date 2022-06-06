@Override
    public HttpMethod getMethod() {
        return HttpMethod.resolve(delegate.method().name());
    }
