@Override
  public void publish(final Object event) {
    checkNotNull(event);
    log.trace("Publishing event: {}", event);
    eventBus.post(event);
  }
