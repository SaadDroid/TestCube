protected RetryPolicy getRetryPolicy() {
    SimpleRetryPolicy simpleRetryPolicy = new SimpleRetryPolicy();
    simpleRetryPolicy.setMaxAttempts( retryMaxAttempts );
    return simpleRetryPolicy;
  }
