@Override
    public VariableValue<?> convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, VariableValue.class);
        } catch (IOException e) {
            throw new QueryException("Unable to deserialize variable.", e);
        }
    }
