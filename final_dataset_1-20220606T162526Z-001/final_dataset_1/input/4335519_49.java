void logNodeDeprecation(int actualNodeVersion) {
    if (actualNodeVersion < MIN_RECOMMENDED_NODE_VERSION) {
      String msg = String.format("You are using Node.js version %d, which reached end-of-life. " +
        "Support for this version will be dropped in future release, please upgrade Node.js to more recent version.",
        actualNodeVersion);
      LOG.warn(msg);
      if (isSonarQube() && analysisWarnings != null) {
        analysisWarnings.addUnique(msg);
      }
    }
  }
