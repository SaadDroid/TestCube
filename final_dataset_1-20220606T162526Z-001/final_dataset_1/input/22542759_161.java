@Nullable
  public RouteDestination getRoutingService(String requestPath, HttpRequest httpRequest) {
    try {
      String method = httpRequest.method().name();
      AllowedMethod requestMethod = AllowedMethod.valueOf(method);
      String[] uriParts = StreamSupport
        .stream(Splitter.on('/').omitEmptyStrings().split(requestPath).spliterator(), false)
        .toArray(String[]::new);

      if (uriParts[0].equals(Constants.Gateway.API_VERSION_3_TOKEN)) {
        return getV3RoutingService(uriParts, requestMethod);
      }
    } catch (Exception e) {
      // Ignore exception. Default routing to app-fabric.
    }
    return APP_FABRIC_HTTP;
  }
