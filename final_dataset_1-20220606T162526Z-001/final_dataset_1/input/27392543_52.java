public void saveConfigToFile(final Config config, final Path destPath)
      throws IOException {
    final String configAsHoconString = config.root().render();
    this.fileUtils.saveToFile(configAsHoconString, destPath);
  }
