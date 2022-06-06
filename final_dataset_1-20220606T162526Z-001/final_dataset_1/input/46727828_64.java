@Override
  public void configure(Configuration conf) throws ConfigurationException {
    configureRegexRegions(conf);
    configureFields(conf);
    configureDelimiter(conf);
  }
