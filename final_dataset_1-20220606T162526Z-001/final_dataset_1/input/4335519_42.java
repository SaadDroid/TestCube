List<String> tsconfigs(SensorContext context) throws IOException {
    for (Provider provider : providers) {
      List<String> tsconfigs = provider.tsconfigs(context);
      if (!tsconfigs.isEmpty()) {
        return tsconfigs;
      }
    }
    return emptyList();
  }
