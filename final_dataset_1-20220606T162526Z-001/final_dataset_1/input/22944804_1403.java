public Promise<ResourceResponse, ResourceException> createInstance(Context serverContext,
            CreateRequest createRequest) {
        String principal = PrincipalRestUtils.getPrincipalNameFromServerContext(serverContext);

        String json = createRequest.getContent().toString();
        Token token = serialisation.deserialise(json, Token.class);
        try {
            store.createAsync(token);

            Map<String, String> result = new HashMap<String, String>();
            result.put(TOKEN_ID, token.getTokenId());

            ResourceResponse resource = newResourceResponse(
                    token.getTokenId(),
                    String.valueOf(System.currentTimeMillis()),
                    new JsonValue(result));

            debug("CREATE by {0}: Stored token with ID: {1}", principal, token.getTokenId());
            return newResultPromise(resource);
        } catch (IllegalArgumentException e) {
            return new BadRequestException(e.getMessage()).asPromise();
        } catch (CoreTokenException e) {
            error(e, "CREATE by {0}: Error creating token resource with ID: {1}", principal, token.getTokenId());
            return generateException(e).asPromise();
        }
    }
