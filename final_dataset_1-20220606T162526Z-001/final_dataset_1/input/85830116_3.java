public void processSaga(Class<? extends Saga> saga) {

    SagaStreamConfig[] s = saga.getAnnotationsByType(SagaStreamConfig.class);

    if (s.length == 0) throw new IllegalStateException("Saga does not have @SagaStreamConfig: " + saga);

    recordSagaCreatedByEvent(saga);

    List<String> streams = new ArrayList<>();
    streams.addAll(Arrays.asList(s[0].streams()));

    Arrays.asList(s[0].aggregateRoots()).forEach(aggregateRootClass ->
      streams.add(AggregateRootUtil.getAggregateRootStream(aggregateRootClass))
    );

    for (String stream : streams) {
      if (!subscribedStreams.contains(stream)) {
        subscribedStreams.add(stream);
        streamSubscriptionManager.globallyUniqueSubscriptionFromNow("saga-manager-" + stream, stream, event -> {
          worker.execute(() -> {
            processEvent(event);
          });
        });
      }
    }
  }
