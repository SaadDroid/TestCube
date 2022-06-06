public void installInterpreter(
      final InterpreterInstallationRequest request, final ServiceCallback<String> serviceCallback)
      throws Exception {
    Preconditions.checkNotNull(request);
    String interpreterName = request.getName();
    Preconditions.checkNotNull(interpreterName);
    Preconditions.checkNotNull(request.getArtifact());

    String interpreterBaseDir = conf.getInterpreterDir();
    String localRepoPath = conf.getInterpreterLocalRepoPath();

    final DependencyResolver dependencyResolver = new DependencyResolver(localRepoPath);

    String proxyUrl = conf.getZeppelinProxyUrl();
    if (null != proxyUrl) {
      String proxyUser = conf.getZeppelinProxyUser();
      String proxyPassword = conf.getZeppelinProxyPassword();
      try {
        dependencyResolver.setProxy(new URL(proxyUrl), proxyUser, proxyPassword);
      } catch (MalformedURLException e) {
        // TODO(jl): Not sure if it's good to raise an exception
        throw new Exception("Url is not valid format", e);
      }
    }

    // TODO(jl): Make a rule between an interpreter name and an installation directory
    List<String> possibleInterpreterDirectories = Lists.newArrayList();
    possibleInterpreterDirectories.add(interpreterName);
    if (interpreterName.startsWith(ZEPPELIN_ARTIFACT_PREFIX)) {
      possibleInterpreterDirectories.add(interpreterName.replace(ZEPPELIN_ARTIFACT_PREFIX, ""));
    } else {
      possibleInterpreterDirectories.add(ZEPPELIN_ARTIFACT_PREFIX + interpreterName);
    }

    for (String pn : possibleInterpreterDirectories) {
      Path testInterpreterDir = Paths.get(interpreterBaseDir, pn);
      if (Files.exists(testInterpreterDir)) {
        throw new Exception("Interpreter " + interpreterName + " already exists with " + pn);
      }
    }

    final Path interpreterDir = Paths.get(interpreterBaseDir, interpreterName);

    try {
      Files.createDirectories(interpreterDir);
    } catch (Exception e) {
      throw new Exception("Cannot create " + interpreterDir.toString());
    }

    // It might take time to finish it
    EXECUTOR_SERVICE.execute(
        new Runnable() {
          @Override
          public void run() {
            downloadInterpreter(request, dependencyResolver, interpreterDir, serviceCallback);
          }
        });
  }
