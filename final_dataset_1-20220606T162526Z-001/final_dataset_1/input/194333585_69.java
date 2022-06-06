public static String getConnectionUrl(Properties props, Configuration conf)
            throws ClassNotFoundException, SQLException {
        return getConnectionUrl(props, conf, null);
    }
