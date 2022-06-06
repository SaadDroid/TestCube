public void checkUpdateAttributes(Map<String, String> attributes) {
        if (attributes == null || attributes.isEmpty()) {
            throw new APIException(format("Attributes '%s' and '%s' must be specified", CaseVariableItem.ATTRIBUTE_TYPE, CaseVariableItem.ATTRIBUTE_VALUE));
        }
        if (!attributes.containsKey(CaseVariableItem.ATTRIBUTE_TYPE)) {
            throw new APIException(format("Attribute '%s' must be specified", CaseVariableItem.ATTRIBUTE_TYPE));
        }
        if (!attributes.containsKey(CaseVariableItem.ATTRIBUTE_VALUE)) {
            throw new APIException(format("Attribute '%s' must be specified", CaseVariableItem.ATTRIBUTE_VALUE));
        }
    }
