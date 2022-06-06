@Override
  public Configuration loadFileConfiguration(String filePath) throws IOException {
    File configurationFile = new File(filePath);
    String configurationJson = FileUtils.readFileToString(configurationFile);

    return loadJsonConfiguration(configurationJson);
  }
