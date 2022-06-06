public Config loadPullFile(Path path, Config sysProps, boolean loadGlobalProperties, boolean resolve) throws IOException {
    Config fallback = loadGlobalProperties ? loadAncestorGlobalConfigs(path, sysProps) : sysProps;
    Config loadedConfig;

    if (this.javaPropsPullFileFilter.accept(path)) {
      loadedConfig = loadJavaPropsWithFallback(path, fallback);
    } else if (this.hoconPullFileFilter.accept(path)) {
      loadedConfig = loadHoconConfigAtPath(path).withFallback(fallback);
    } else {
      throw new IOException(String.format("Cannot load pull file %s due to unrecognized extension.", path));
    }

    return resolve ? loadedConfig.resolve() : loadedConfig;
  }
