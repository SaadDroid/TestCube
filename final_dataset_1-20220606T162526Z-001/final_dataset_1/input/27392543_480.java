public AzkabanClientStatus fetchExecutionLog(String execId,
                                               String jobId,
                                               String offset,
                                               String length,
                                               File ouf) throws AzkabanClientException {
    AzkabanMultiCallables.FetchExecLogCallable callable =
        AzkabanMultiCallables.FetchExecLogCallable.builder()
            .client(this)
            .execId(execId)
            .jobId(jobId)
            .offset(offset)
            .length(length)
            .output(ouf)
            .build();

    return runWithRetry(callable, AzkabanClientStatus.class);
  }
