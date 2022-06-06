@Override
  public void startServerLazily(SensorContext context) throws IOException {
    // required for SonarLint context to avoid restarting already failed server
    if (failedToStart) {
      throw new ServerAlreadyFailedException();
    }

    try {
      if (isAlive()) {
        LOG.debug("eslint-bridge server is up, no need to start.");
        return;
      }
      deploy();
      List<Path> deployedBundles = rulesBundles.deploy();
      startServer(context, deployedBundles);
    } catch (NodeCommandException e) {
      failedToStart = true;
      throw e;
    }
  }
