@Override
    public Privilege parsePolicy(String name, JsonValue json)
            throws EntitlementException {

        if (json == null || json.isNull()) {
            throw new EntitlementException(EntitlementException.INVALID_JSON, "No JSON body provided.");
        }

        return parsePrivilege(name, json);
    }
