public RedirectCallback convertFromJson(RedirectCallback callback, JsonValue jsonCallback) throws RestAuthException {

        validateCallbackType(CALLBACK_NAME, jsonCallback);

        // Nothing to do here as RedirectCallback is purely used to send redirect information to the client.

        return callback;
    }
