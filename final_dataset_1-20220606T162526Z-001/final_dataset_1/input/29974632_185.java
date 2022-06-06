@SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public Optional<FieldInfo<?>> getFieldInfoForNode(final String nodeName, final Collection<String> selectedFieldIds) {
        final Optional<FieldInfo<?>> maybeFieldInfo = Optional.ofNullable(getFieldsInfo().getFieldConfigByName().get(fieldPathNormaliser.normaliseFieldPath(nodeName)));
        return maybeFieldInfo
                .filter(fieldInfo -> selected(selectedFieldIds, fieldInfo.getId()));
    }
