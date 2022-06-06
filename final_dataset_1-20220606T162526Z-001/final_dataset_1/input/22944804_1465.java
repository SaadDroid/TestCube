public Callback[] handleJsonCallbacks(final Callback[] originalCallbacks, final JsonValue jsonCallbacks)
            throws RestAuthException {

        if (originalCallbacks.length != jsonCallbacks.size()) {
            logger.error("Incorrect number of callbacks found in JSON response");
            throw new RestAuthException(ResourceException.BAD_REQUEST,
                    "Incorrect number of callbacks found in JSON response");
        }

        for (int i = 0; i < originalCallbacks.length; i++) {

            final Callback originalCallback = originalCallbacks[i];

            final RestAuthCallbackHandler restAuthCallbackHandler =
                    restAuthCallbackHandlerFactory.getRestAuthCallbackHandler(originalCallback.getClass());

            final JsonValue jsonCallback = jsonCallbacks.get(i);

            if (!restAuthCallbackHandler.getCallbackClassName().equals(jsonCallback.get("type").asString())) {
                logger.error("Required callback not found in JSON response");
                throw new RestAuthException(ResourceException.BAD_REQUEST,
                        "Required callback not found in JSON response");
            }

            restAuthCallbackHandler.convertFromJson(originalCallback, jsonCallback);
        }

        return originalCallbacks;
    }
