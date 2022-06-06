void run(final String[] args)
      throws IOException, InterruptedException {
    final OutputStreamWriter streamWriter = new OutputStreamWriter(System.out, Charsets.UTF_8);
    final PrintWriter writer = new PrintWriter(streamWriter, true);
    final SingleTaskRunnerMainOptions options = new SingleTaskRunnerMainOptions(args, writer);
    final SingleTaskRunner runner =
        this.builder.setClusterConfigFilePath(options.getClusterConfigFilePath())
            .setJobId(options.getJobId())
            .setWorkUnitFilePath(options.getWorkUnitFilePath())
            .createSingleTaskRunner();
    runner.run();
  }
