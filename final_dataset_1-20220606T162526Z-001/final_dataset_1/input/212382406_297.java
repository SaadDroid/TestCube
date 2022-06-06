@Override
  public V call() throws Exception {
    int attempts = 0;
    Exception cause;
    while (true) {
      try {
        return task.call();
      } catch (Exception e) {
        cause = e;
        RetryPolicy.RetryAction action = retryPolicy.shouldRetry(e, ++attempts,
             0, true);
        if (action.action == RetryPolicy.RetryAction.RetryDecision.RETRY) {
          LOG.info("Execution of task {} failed, will be retried in {} ms",
              name, action.delayMillis);
          ThreadUtil.sleepAtLeastIgnoreInterrupts(action.delayMillis);
        } else {
          break;
        }
      }
    }

    String msg = String.format(
        "Execution of task %s failed permanently after %d attempts",
        name, attempts);
    LOG.warn(msg, cause);
    throw new IOException(msg, cause);
  }
