@Override
    public String getValue(String key) {
        try {
            log.log(Level.FINE, "load {0} from typesafe config", key);
            return config.getString(key);
        } catch (ConfigException ex) {
            log.log(Level.WARNING, "Config key '{0}' could not be retrieved due to ConfigException with "
                    + "message '{1}'. To see stack trace enable trace logging", new String[]{key, ex.getMessage()});
            log.log(Level.FINER, "ConfigException stack trace", ex);
            return null;
        }
    }
