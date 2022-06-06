public File getReconDbDir(ConfigurationSource conf, String dirConfigKey) {

    File metadataDir = getDirectoryFromConfig(conf, dirConfigKey,
        "Recon");
    if (metadataDir != null) {
      return metadataDir;
    }

    LOG.warn("{} is not configured. We recommend adding this setting. " +
            "Falling back to {} instead.",
        dirConfigKey, HddsConfigKeys.OZONE_METADATA_DIRS);
    return getOzoneMetaDirPath(conf);
  }
