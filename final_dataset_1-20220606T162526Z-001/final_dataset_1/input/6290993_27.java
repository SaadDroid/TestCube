public static void writeConnectionPropertiesToBundle(Properties connectionProperties, FormatBundle bundle) {
    for (final String name : connectionProperties.stringPropertyNames()) {
      bundle.set(generateConnectionPropertyKey(name), connectionProperties.getProperty(name));
    }
  }
