public static <S extends ScopeType<S>> EventBus get(String eventBusName, SharedResourcesBroker<S> broker)
      throws IOException {
    try {
      return broker.getSharedResource(new EventBusFactory<S>(), new EventBusKey(eventBusName));
    } catch (NotConfiguredException e) {
      throw new IOException(e);
    }
  }
