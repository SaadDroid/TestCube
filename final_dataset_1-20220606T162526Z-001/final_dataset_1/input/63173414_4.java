@Override public Observable onLegalMock(final Object mock, final Metadata<RxRetrofit> metadata) {
    checkReturnMethodTypeIsObservable(metadata);
    checkTypeMockIsNotObservableNeitherResponse(metadata, mock);

    NetworkBehavior networkBehavior = networkBehaviour(metadata);
    return callAdapter.adapt(metadata.getMethod(),
        networkBehavior, Calls.response(mock));
  }
