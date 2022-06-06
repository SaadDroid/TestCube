public JsonValue convertToJson(PasswordCallback callback, int index) {

        String prompt = callback.getPrompt();

        JsonValue jsonValue = JsonValueBuilder.jsonValue()
                .put("type", CALLBACK_NAME)
                .array("output")
                .addLast(createOutputField("prompt", prompt))
                .array("input")
                .addLast(createInputField(index, ""))
                .build();

        return jsonValue;
    }
