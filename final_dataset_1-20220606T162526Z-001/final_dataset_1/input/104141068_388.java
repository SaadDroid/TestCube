@Override
    @SuppressWarnings("unchecked")
    public Map<String, Object> convertToEntityAttribute(final String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return Json.getObjectMapper().readValue(str, Map.class);
        } catch (final IOException ex) {
            throw new MinijaxException(ex.getMessage(), ex);
        }
    }
