@PublicAPI(usage = ACCESS)
    public String getPropertyOrDefault(String propertyName, String defaultValue) {
        return properties.getProperty(propertyName, defaultValue);
    }
