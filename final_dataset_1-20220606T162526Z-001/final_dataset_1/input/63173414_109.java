@Override public Object onIllegalMock(final AssertionError assertionError, final Metadata<Rx2Retrofit> metadata) {
    checkReturnMethodTypeIsSingleOrCompletable(metadata);

    final String errorMessage = assertionError.getMessage() != null ? assertionError.getMessage() : "";
    final String adaptedErrorMessage = adaptErrorResponse(errorMessage, metadata);
    NetworkBehavior networkBehavior = networkBehaviour(metadata);

    final ResponseBody responseBody = ResponseBody
        .create(MediaType.parse("application/json"), adaptedErrorMessage);

    return callAdapter.adapt(metadata.getMethod(),
        networkBehavior, Calls.response(Response.error(404, responseBody)));
  }
