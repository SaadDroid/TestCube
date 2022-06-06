public RunMode getRunMode() {
    return RunMode.valueOf(_config.getString(ARG_RUN_MODE).toUpperCase());
  }
