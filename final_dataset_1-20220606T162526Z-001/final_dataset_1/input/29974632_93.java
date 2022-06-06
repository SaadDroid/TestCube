public <R> R get(
        final String path,
        final List<NameValuePair> queryParams,
        final Class<R> resultType
    ) throws ControlPointApiException {
        return performAuthenticatedRequest(buildGetRequest(path, queryParams), resultType);
    }
