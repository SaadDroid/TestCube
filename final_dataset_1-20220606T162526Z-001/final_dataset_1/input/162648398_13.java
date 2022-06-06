@Override
  public CompletableFuture<String> delete(RequestContext requestContext) {
    requestContext.setMethod(RequestMethod.DELETE);
    return invokeHttp(requestContext);
  }
