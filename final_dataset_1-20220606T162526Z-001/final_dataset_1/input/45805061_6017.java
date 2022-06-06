public static String toBloombergKeyWithDataProvider(ExternalId externalId, String dataProvider) {
    ArgumentChecker.notNull(externalId, "externalId");
    if (dataProvider == null || dataProvider.contains(DATA_PROVIDER_UNKNOWN) || dataProvider.equalsIgnoreCase(DEFAULT_DATA_PROVIDER)) {
      return toBloombergKey(externalId);
    }
    
    ExternalScheme scheme = externalId.getScheme();
    if (SCHEME_MAP.containsKey(scheme)) {
      String prefix = SCHEME_MAP.get(scheme);
      StringBuilder buf = new StringBuilder();
      if (prefix != null) {
        buf.append(prefix);
      }
      if (scheme.equals(ExternalSchemes.BLOOMBERG_TICKER)) {
        String id  = externalId.getValue().toUpperCase(Locale.US);
        if (id.endsWith("EQUITY")) {
          buf.append(id);
        } else {
          String[] splits = id.split(" ");
          if (id.endsWith("CURNCY") || id.endsWith("INDEX")) {
            buf.append(splits[0]).append(" ").append(dataProvider);
          } else {
            buf.append(splits[0]).append("@").append(dataProvider);
          }
          for (int i = 1; i < splits.length; i++) {
            buf.append(" ").append(splits[i]);
          }
        }
      } else {
        buf.append(externalId.getValue()).append("@").append(dataProvider);
      }
      return buf.toString();
    }
    s_logger.warn("Unknown ExternalScheme {}", externalId);
    return externalId.getValue();
  }
