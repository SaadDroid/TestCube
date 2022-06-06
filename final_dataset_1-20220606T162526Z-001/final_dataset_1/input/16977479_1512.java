@Override
    public ResponseBuilder allow(String... methods) {
        return addHeader(HttpHeaders.ALLOW, (Object[])methods);
    }
