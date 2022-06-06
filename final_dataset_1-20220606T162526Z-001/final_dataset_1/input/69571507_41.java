@Override public CheckResult check() {
    try {
      String status = get().describeStream(streamName).getStreamDescription().getStreamStatus();
      if (status.equalsIgnoreCase("ACTIVE")) {
        return CheckResult.OK;
      } else {
        return CheckResult.failed(new IllegalStateException("Stream is not active"));
      }
    } catch (Exception e) {
      return CheckResult.failed(e);
    }
  }
