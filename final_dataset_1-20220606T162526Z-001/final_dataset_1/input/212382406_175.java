public static File getOmDbDir(ConfigurationSource conf) {
    return ServerUtils.getDBPath(conf, OMConfigKeys.OZONE_OM_DB_DIRS);
  }
