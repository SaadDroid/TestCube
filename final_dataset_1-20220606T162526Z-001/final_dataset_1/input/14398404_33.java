public static String storeProperties(Properties properties) {
        StringWriter writer = new StringWriter();
        Object[] keys = properties.keySet().toArray();
        //Set<Object> keys = properties.keySet();
        for (int i = 0,ll=keys.length; i < ll; i++) {
            String key = keys[i].toString();
            writer.write(StringUtils.escape( key.trim(), '\\', ';'));
            writer.write("=");
            writer.write(StringUtils.escape( properties.getProperty(key), '\\', ';'));
            if (i<ll-1) {
                writer.write(";");
            }
        }
        return writer.toString();
    }
