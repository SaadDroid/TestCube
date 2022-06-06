public <T> String serialize(T payload) {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        try {
            return mapper.writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            throw new SerializationException("Unable to serialize payload", e);
        }
    }
