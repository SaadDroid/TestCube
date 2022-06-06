public NameCallback convertFromJson(NameCallback callback, JsonValue jsonCallback) throws RestAuthException {

        validateCallbackType(CALLBACK_NAME, jsonCallback);

        JsonValue input = jsonCallback.get("input");

        if (input.size() != 1) {
            throw new JsonException("JSON Callback does not include a input field");
        }

        JsonValue inputField = input.get(0);
        String value = inputField.get("value").asString();
        callback.setName(value);

        return callback;
    }
