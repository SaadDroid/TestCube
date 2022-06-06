public Optional<Metadata> getFieldMetadata(String schemaFullName, String field) {
        Validate.notBlank(schemaFullName, "Schema full name is blank");
        Validate.notBlank(field, "Field is blank");

        MultiValuedMap<String, String> entityFields = getEntityFields();
        Collection<String> fields = entityFields.get(schemaFullName);
        if (fields == null || !fields.contains(field)) {
            throw new IllegalArgumentException(
                    String.format("Schema has no field '%s' in '%s'", field, schemaFullName));
        }

        FieldDescriptor key = FieldDescriptor.with(schemaFullName, field);
        return Optional.ofNullable(getFieldMetadata().get(key));
    }
