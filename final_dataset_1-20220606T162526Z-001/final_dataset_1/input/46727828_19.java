@Override
  public void nextTuple() {
    if (isRateLimited()) {
      rateLimiter.acquire();
    }
    kafkaSpout.nextTuple();
  }
