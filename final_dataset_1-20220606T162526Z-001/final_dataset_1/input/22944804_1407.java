public Promise<ResourceResponse, ResourceException> readInstance(Context serverContext, String tokenId,
            ReadRequest readRequest) {

        String principal = PrincipalRestUtils.getPrincipalNameFromServerContext(serverContext);

        try {
            Token token = store.read(tokenId);
            if (token == null) {
                error("READ by {0}: No token resource to read with ID: {1}", principal, tokenId);
                return generateNotFoundException(tokenId).asPromise();
            }

            String json = serialisation.serialise(token);
            ResourceResponse response = newResourceResponse(
                    tokenId,
                    String.valueOf(System.currentTimeMillis()),
                    JsonValueBuilder.toJsonValue(json));

            debug("READ by {0}: Read token resource with ID: {1}", principal, tokenId);
            return newResultPromise(response);
        } catch (CoreTokenException e) {
            error(e, "READ by {0}: Error reading token resource with ID: {1}", principal, tokenId);
            return generateException(e).asPromise();
        }
    }
