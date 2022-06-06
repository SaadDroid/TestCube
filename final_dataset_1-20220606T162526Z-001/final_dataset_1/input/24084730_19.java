public ConfigSource fromPropertiesYamlLiteral(Properties props, String keyPrefix) {
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        for (String propName : props.stringPropertyNames()) {
            builder.put(propName, props.getProperty(propName));
        }
        return fromPropertiesYamlLiteral(builder.build(), keyPrefix);
    }
