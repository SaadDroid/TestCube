public static <S extends ScopeType<S>> DataPublisher get(String publisherClassName, State state,
      SharedResourcesBroker<S> broker) throws IOException {
    try {
      return broker.getSharedResource(new DataPublisherFactory<S>(), new DataPublisherKey(publisherClassName, state));
    } catch (NotConfiguredException nce) {
      throw new IOException(nce);
    }
  }
