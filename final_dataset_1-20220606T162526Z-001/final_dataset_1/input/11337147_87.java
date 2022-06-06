Properties getAlsoCustomAndInternalPropertiesFromFilename(Map<String, Properties> propertiesByFilename, String propertiesFileName) {
        Properties properties = new Properties();
        if (propertiesByFilename != null) {
            if (propertiesByFilename.containsKey(propertiesFileName)) {
                properties.putAll(propertiesByFilename.get(propertiesFileName));
            }
            // if -internal properties also exists, merge key/value pairs:
            final String internalFilename = getSuffixedPropertyFilename(propertiesFileName, "-internal");
            if (propertiesByFilename.containsKey(internalFilename)) {
                properties.putAll(propertiesByFilename.get(internalFilename));
            }
            // if -custom properties also exists, merge key/value pairs (and overwrite previous values if same key name):
            final String customFilename = getSuffixedPropertyFilename(propertiesFileName, "-custom");
            if (propertiesByFilename.containsKey(customFilename)) {
                properties.putAll(propertiesByFilename.get(customFilename));
            }
        }
        return properties;
    }
