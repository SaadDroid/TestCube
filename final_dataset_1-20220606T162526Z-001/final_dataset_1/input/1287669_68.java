public static JsonAsserter with(String json) {
        return new JsonAsserterImpl(JsonPath.parse(json).json());
    }
