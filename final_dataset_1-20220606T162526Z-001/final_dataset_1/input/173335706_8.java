public static double getDouble(String key) {
        String val = getString(key);
        return getDouble(key,-1.0);
    }
