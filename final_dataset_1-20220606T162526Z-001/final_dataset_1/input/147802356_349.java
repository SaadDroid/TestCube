@VisibleForTesting
  void subscribeValidator(final WsConnectContext handler) {
    final SubscriptionStatus subscriptionStatus =
        subscriptionManager.subscribe(
            handler.getSessionId(),
            (msg) -> {
              try {
                final String json = jsonProvider.objectToJSON(msg);
                handler
                    .session
                    .getRemote()
                    .sendString(
                        json,
                        new WriteCallback() {
                          @Override
                          public void writeFailed(final Throwable x) {
                            LOG.error(
                                "Error sending msg to validator {}", handler.getSessionId(), x);
                            handler.session.close(
                                StatusCode.SERVER_ERROR,
                                "Unexpected error on Remote Validator server");
                          }

                          @Override
                          public void writeSuccess() {}
                        });
              } catch (JsonProcessingException e) {
                LOG.error("Error sending msg to validator {}", handler.getSessionId(), e);
                handler.session.close(
                    StatusCode.SERVER_ERROR, "Unexpected error on Remote Validator server");
              }
            });

    if (!subscriptionStatus.hasSubscribed()) {
      handler.session.close(StatusCode.NORMAL, subscriptionStatus.getInfo());
    }
  }
