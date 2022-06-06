public static void updateEnvironmentForMRAM(Configuration conf, Map<String, String> environment) {
    TezYARNUtils.appendToEnvFromInputString(environment, conf.get(MRJobConfig.MR_AM_ADMIN_USER_ENV),
        File.pathSeparator);
    TezYARNUtils.appendToEnvFromInputString(environment, conf.get(MRJobConfig.MR_AM_ENV),
        File.pathSeparator);
  }
