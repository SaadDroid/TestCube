@Override public Call onLegalMock(Object mock, Metadata<Retrofit> metadata) {
    checkReturnMethodTypeIsCall(metadata);
    checkTypeMockIsNotCall(metadata, mock);

    NetworkBehavior networkBehavior = networkBehaviour(metadata);
    return callAdapter.adapt(metadata.getMethod(),
        networkBehavior, Calls.response(mock));
  }
