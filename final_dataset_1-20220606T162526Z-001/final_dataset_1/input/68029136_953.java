public static String getProperty(ConfigKey key, String defaultValue) {
        String propertyValue = getPropertyValue(key);
        
        if(propertyValue != null){
            return propertyValue;
        }
        
        return defaultValue;
    }
