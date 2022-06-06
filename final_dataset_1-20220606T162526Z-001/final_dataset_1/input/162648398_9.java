@Override
  public CompletableFuture<String> patch(RequestContext requestContext) {
    requestContext.setMethod(RequestMethod.PATCH);
    HttpRequestBase request = buildRequest(requestContext);
    HttpClientCallback callback = new HttpClientCallback();
    asyncHttpClient.execute(request, callback);
    return callback;
  }
