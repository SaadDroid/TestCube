@Override
  public CompletableFuture<String> get(RequestContext requestContext) {
    requestContext.setMethod(RequestMethod.GET);
    HttpRequestBase request = buildRequest(requestContext);
    HttpClientCallback future = new HttpClientCallback();
    asyncHttpClient.execute(request, future);
    return future;
  }
