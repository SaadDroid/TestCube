@Override
  public Future<?> deleteSpec(URI deletedSpecURI, Properties headers) {
    AvroJobSpec avroJobSpec = AvroJobSpec.newBuilder().setUri(deletedSpecURI.toString())
        .setMetadata(ImmutableMap.of(VERB_KEY, SpecExecutor.Verb.DELETE.name()))
        .setProperties(Maps.fromProperties(headers)).build();
    try {
      writeAvroJobSpec(avroJobSpec);
      return new CompletedFuture<>(Boolean.TRUE, null);
    } catch (IOException e) {
      log.error("Exception encountered when writing DELETE spec");
      return new CompletedFuture<>(Boolean.TRUE, e);
    }
  }
