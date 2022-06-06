public static <S extends ScopeType<S>> HiveConf get(Optional<String> hcatURI, SharedResourcesBroker<S> broker)
      throws IOException {
    try {
      SharedHiveConfKey confKey =
          hcatURI.isPresent() && StringUtils.isNotBlank(hcatURI.get()) ? new SharedHiveConfKey(hcatURI.get())
              : SharedHiveConfKey.INSTANCE;
      return broker.getSharedResource(new HiveConfFactory<>(), confKey);
    } catch (NotConfiguredException nce) {
      throw new IOException(nce);
    }
  }
