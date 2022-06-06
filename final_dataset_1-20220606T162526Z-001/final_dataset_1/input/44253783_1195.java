@Override
  public synchronized void onAdaptrisMessage(AdaptrisMessage msg, Consumer<AdaptrisMessage> success, Consumer<AdaptrisMessage> failure) {
    ListenerCallbackHelper.prepare(msg, success, failure);
    if (!obtainChannel().isAvailable()) {
      handleChannelUnavailable(msg); // make pluggable?
    } else {
      handleMessage(msg, false);
    }
  }
