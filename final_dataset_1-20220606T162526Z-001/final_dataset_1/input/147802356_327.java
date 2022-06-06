static String defaultStoragePathForNormalizedOS(
      final String detectedOS, Map<String, String> env) {
    if (detectedOS.equals("windows")) {
      return env.get(ENV_LOCALAPPDATA) + "\\teku";
    } else if (detectedOS.equals("osx")) {
      return env.get(ENV_HOME) + "/Library/teku";
    }
    String dataHome = env.get(ENV_XDG_DATA_HOME);
    if (StringUtils.isEmpty(dataHome)) {
      dataHome = env.get(ENV_HOME) + "/.local/share";
    }
    return dataHome + "/teku";
  }
