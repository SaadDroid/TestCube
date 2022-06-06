protected List<WorkUnitState> getPreviousWorkUnitStatesForRetry(SourceState state) {
    if (Iterables.isEmpty(state.getPreviousWorkUnitStates())) {
      return ImmutableList.of();
    }

    // Determine a work unit retry policy
    WorkUnitRetryPolicy workUnitRetryPolicy;
    if (state.contains(ConfigurationKeys.WORK_UNIT_RETRY_POLICY_KEY)) {
      // Use the given work unit retry policy if specified
      workUnitRetryPolicy = WorkUnitRetryPolicy.forName(state.getProp(ConfigurationKeys.WORK_UNIT_RETRY_POLICY_KEY));
    } else {
      // Otherwise set the retry policy based on if work unit retry is enabled
      boolean retryFailedWorkUnits = state.getPropAsBoolean(ConfigurationKeys.WORK_UNIT_RETRY_ENABLED_KEY, true);
      workUnitRetryPolicy = retryFailedWorkUnits ? WorkUnitRetryPolicy.ALWAYS : WorkUnitRetryPolicy.NEVER;
    }

    if (workUnitRetryPolicy == WorkUnitRetryPolicy.NEVER) {
      return ImmutableList.of();
    }

    List<WorkUnitState> previousWorkUnitStates = Lists.newArrayList();
    // Get previous work units that were not successfully committed (subject for retries)
    for (WorkUnitState workUnitState : state.getPreviousWorkUnitStates()) {
      if (workUnitState.getWorkingState() != WorkUnitState.WorkingState.COMMITTED) {
        if (state.getPropAsBoolean(ConfigurationKeys.OVERWRITE_CONFIGS_IN_STATESTORE,
            ConfigurationKeys.DEFAULT_OVERWRITE_CONFIGS_IN_STATESTORE)) {
          // We need to make a copy here since getPreviousWorkUnitStates returns ImmutableWorkUnitStates
          // for which addAll is not supported
          WorkUnitState workUnitStateCopy = new WorkUnitState(workUnitState.getWorkunit(), state);
          workUnitStateCopy.addAll(workUnitState);
          workUnitStateCopy.overrideWith(state);
          previousWorkUnitStates.add(workUnitStateCopy);
        } else {
          previousWorkUnitStates.add(workUnitState);
        }
      }
    }

    if (workUnitRetryPolicy == WorkUnitRetryPolicy.ALWAYS) {
      return previousWorkUnitStates;
    }

    JobCommitPolicy jobCommitPolicy = JobCommitPolicy
        .forName(state.getProp(ConfigurationKeys.JOB_COMMIT_POLICY_KEY, ConfigurationKeys.DEFAULT_JOB_COMMIT_POLICY));
    if ((workUnitRetryPolicy == WorkUnitRetryPolicy.ON_COMMIT_ON_PARTIAL_SUCCESS
        && jobCommitPolicy == JobCommitPolicy.COMMIT_ON_PARTIAL_SUCCESS)
        || (workUnitRetryPolicy == WorkUnitRetryPolicy.ON_COMMIT_ON_FULL_SUCCESS
            && jobCommitPolicy == JobCommitPolicy.COMMIT_ON_FULL_SUCCESS)) {
      return previousWorkUnitStates;
    }
    // Return an empty list if job commit policy and work unit retry policy do not match
    return ImmutableList.of();
  }
