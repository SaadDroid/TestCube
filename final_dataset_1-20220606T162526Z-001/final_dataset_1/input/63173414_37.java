@Override public Type[] supportedTypes(Metadata<Enum> metadata) {
    Type[] types = SupportedTypes.concat(SupportedTypes.NUMERIC, SupportedTypes.TEXT);
    return types;
  }
