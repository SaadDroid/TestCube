public static Boolean getPropertyAsBoolean(ConfigKey key, Boolean defaultValue) {
        String propValue = getPropertyValue(key);
        
        if(propValue != null){
            return "true".equals(propValue.toLowerCase());
        }
        
        return defaultValue;
    }
