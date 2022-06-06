public static double getDouble(String key, double defaultVal) {
        String val = properties.getProperty(key.trim());
        return val == null ? defaultVal : Double.parseDouble(val);
    }
