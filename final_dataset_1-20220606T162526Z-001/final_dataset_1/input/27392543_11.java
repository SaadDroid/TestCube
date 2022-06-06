public static Path getDefaultWriterFilePath(State state, int numBranches, int branchId) {
    if (state instanceof WorkUnitState) {
      WorkUnitState workUnitState = (WorkUnitState) state;
      return new Path(ForkOperatorUtils.getPathForBranch(workUnitState, workUnitState.getOutputFilePath(),
          numBranches, branchId));
    } else if (state instanceof WorkUnit) {
      WorkUnit workUnit = (WorkUnit) state;
      return new Path(ForkOperatorUtils.getPathForBranch(workUnit, workUnit.getOutputFilePath(),
          numBranches, branchId));
    }

    throw new RuntimeException("In order to get the default value for " + ConfigurationKeys.WRITER_FILE_PATH
        + " the given state must be of type " + WorkUnitState.class.getName() + " or " + WorkUnit.class.getName());
  }
