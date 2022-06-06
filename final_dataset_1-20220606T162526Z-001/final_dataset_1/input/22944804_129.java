String getValidatedField(String type, Map<String, ?> params, Map<String, Set<String>> attrs, String field,
            String errorKey) throws WorkflowException {
        if ("other".equals(type)) {
            return getNonEmptyString(params, field, errorKey);
        } else {
            String value = CollectionHelper.getMapAttr(attrs, field);
            if (StringUtils.isEmpty(value)) {
                throw new WorkflowException(errorKey, null);
            }
            return value;
        }
    }
