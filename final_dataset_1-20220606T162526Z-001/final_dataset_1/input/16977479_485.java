public Object readFrom(Class<Object> cls, Type t, Annotation[] anns,
                           MediaType mt, MultivaluedMap<String, String> headers, InputStream is)
        throws IOException, WebApplicationException {
        if (TokenIntrospection.class.isAssignableFrom(cls)) {
            return fromMapToTokenIntrospection(is);
        }
        Map<String, String> params = readJSONResponse(is);
        if (Map.class.isAssignableFrom(cls)) {
            return params;
        }
        ClientAccessToken token = OAuthClientUtils.fromMapToClientToken(params);
        if (token == null) {
            throw new WebApplicationException(500);
        }
        return token;

    }
