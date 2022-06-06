public JsonValue convertToJson(HttpCallback callback, int index) throws RestAuthException {
        throw new RestAuthException(ResourceException.BAD_REQUEST, new UnsupportedOperationException(
                "HttpCallback Authorization Header must be specified in the initial request. Cannot be converted into"
                        + " a JSON representation."));
    }
