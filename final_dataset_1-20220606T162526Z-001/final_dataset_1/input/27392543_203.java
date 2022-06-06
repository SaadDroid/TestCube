public static JobLock getJobLock(Properties properties, JobLockEventListener jobLockEventListener)
          throws JobLockException {
    Preconditions.checkNotNull(properties);
    Preconditions.checkNotNull(jobLockEventListener);
    JobLock jobLock;
    if (properties.containsKey(ConfigurationKeys.JOB_LOCK_TYPE)) {
      try {
        Class<?> jobLockClass = Class.forName(
            properties.getProperty(ConfigurationKeys.JOB_LOCK_TYPE, FileBasedJobLock.class.getName()));
        jobLock = (JobLock) ConstructorUtils.invokeConstructor(jobLockClass, properties);
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
          NoSuchMethodException | InvocationTargetException e) {
        throw new JobLockException(e);
      }
    } else {
      jobLock = new FileBasedJobLock(properties);
    }
    if (jobLock instanceof ListenableJobLock) {
      ((ListenableJobLock)jobLock).setEventListener(jobLockEventListener);
    }
    return jobLock;
  }
