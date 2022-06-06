@Override
    protected String serialize(Object input) throws IllegalArgumentException {
        try {
            return objectMapper.writeValueAsString(input);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e);
        }
    }
