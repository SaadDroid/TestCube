@Override
    public JsonValue printPolicy(Privilege policy) throws EntitlementException {
        JsonPolicy jsonPolicy = new JsonPolicy(policy);
        try {
            String json = MAPPER.writeValueAsString(jsonPolicy);
            return JsonValueBuilder.toJsonValue(json);
        } catch (IOException ex) {
            if (DEBUG.messageEnabled()) {
                DEBUG.message("Unable to serialise policy to JSON", ex);
            }
            throw new EntitlementException(EntitlementException.UNABLE_TO_SERIALIZE_OBJECT);
        }
    }
