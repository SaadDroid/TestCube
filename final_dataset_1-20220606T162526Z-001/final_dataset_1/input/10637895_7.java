public static void updateEnvironmentForMRTasks(Configuration conf,
      Map<String, String> environment, boolean isMap) {
    // Shell
    environment.put(Environment.SHELL.name(), conf.get(
        MRJobConfig.MAPRED_ADMIN_USER_SHELL, MRJobConfig.DEFAULT_SHELL));

    // Add pwd to LD_LIBRARY_PATH, add this before adding anything else
    TezYARNUtils.addToEnvironment(environment, Environment.LD_LIBRARY_PATH.name(),
        Environment.PWD.$(), File.pathSeparator);

    // Add the env variables passed by the admin
    TezYARNUtils.appendToEnvFromInputString(environment, conf.get(
        MRJobConfig.MAPRED_ADMIN_USER_ENV,
        MRJobConfig.DEFAULT_MAPRED_ADMIN_USER_ENV),
        File.pathSeparator);

    // Add the env variables passed by the user
    String mapredChildEnv = (isMap ?
        conf.get(MRJobConfig.MAP_ENV, "")
        : conf.get(MRJobConfig.REDUCE_ENV, ""));
    TezYARNUtils.appendToEnvFromInputString(environment, mapredChildEnv, File.pathSeparator);

    // Set logging level in the environment.
    environment.put(
        "HADOOP_ROOT_LOGGER",
        getChildLogLevel(conf, isMap) + ",CLA");
  }
