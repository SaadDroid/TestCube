public Collection<CoreTokenField> getAttributeNames() {
        Set<CoreTokenField> fields = new HashSet<CoreTokenField>();
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            CoreTokenField field = CoreTokenField.fromLDAPAttribute(entry.getKey());
            if (entry.getValue() == null) {
                continue;
            }
            fields.add(field);
        }
        return Collections.unmodifiableSet(fields);
    }
