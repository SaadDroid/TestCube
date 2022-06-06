@Override
    public Map<String, Object> getMapping(String indexName, String type) throws IOException {
        final Map<String, Mapping> mappings = getMappings(indexName, type);
        final Map<String,Object> properties;
        if (getVersion() < 7 && mappings.containsKey(type)) {
            properties = mappings.get(type).getProperties();
        } else if (getVersion() >= 7) {
            final Mapping mapping = mappings.values().stream().findFirst().orElse(null);
            properties = mapping != null ? mapping.getProperties() : null;
        } else {
            properties = null;
        }
        return properties;
    }
