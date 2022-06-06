public FieldDefinition defineField(String fieldName, int modifiers, String signature, Object value) {
        FieldDefinition field = new FieldDefinition(fieldName, modifiers, signature, value);
        this.fields.add(field);
        return field;
    }
