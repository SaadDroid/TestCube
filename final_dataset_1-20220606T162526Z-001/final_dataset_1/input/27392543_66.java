public static void cleanTaskStagingData(State state, Logger logger) throws IOException {
    int numBranches = state.getPropAsInt(ConfigurationKeys.FORK_BRANCHES_KEY, 1);

    for (int branchId = 0; branchId < numBranches; branchId++) {
      String writerFsUri = state.getProp(
          ForkOperatorUtils.getPropertyNameForBranch(ConfigurationKeys.WRITER_FILE_SYSTEM_URI, numBranches, branchId),
          ConfigurationKeys.LOCAL_FS_URI);
      FileSystem fs = getFsWithProxy(state, writerFsUri, WriterUtils.getFsConfiguration(state));

      Path stagingPath = WriterUtils.getWriterStagingDir(state, numBranches, branchId);
      if (fs.exists(stagingPath)) {
        logger.info("Cleaning up staging directory " + stagingPath.toUri().getPath());
        if (!fs.delete(stagingPath, true)) {
          throw new IOException("Clean up staging directory " + stagingPath.toUri().getPath() + " failed");
        }
      }

      Path outputPath = WriterUtils.getWriterOutputDir(state, numBranches, branchId);
      if (fs.exists(outputPath)) {
        logger.info("Cleaning up output directory " + outputPath.toUri().getPath());
        if (!fs.delete(outputPath, true)) {
          throw new IOException("Clean up output directory " + outputPath.toUri().getPath() + " failed");
        }
      }
    }
  }
