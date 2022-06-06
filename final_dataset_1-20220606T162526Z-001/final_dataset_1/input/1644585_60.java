@Override
    public void describeTo(Description description) {
        description.appendText("JsonNode with '" + fieldName + "' matching: ");
        arrayMatcher.describeTo(description);
    }
