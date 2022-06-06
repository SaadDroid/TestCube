@Override
    public List<FieldInfo<?>> getFieldNames(final MetadataNode[] metadataNodes, final Collection<String> selectedFieldIds) {
        final Stream<FieldInfo<?>> metadataStream = Arrays.stream(metadataNodes)
                // Filters metadata fields
                .filter(metadataNode -> selected(selectedFieldIds, metadataNode.getName()))
                .map(this::metadataNodeToFieldInfo);

        final Stream<FieldInfo<?>> nonMetadataStream = getFieldsInfo().getFieldConfig()
                .values()
                .stream()
                // Filters parametric (non-metadata) fields
                .filter(fieldInfo -> selected(selectedFieldIds, fieldInfo.getId()))
                .map(this::populateMissingDisplayNames);

        return Stream.concat(metadataStream, nonMetadataStream).collect(Collectors.toList());
    }
