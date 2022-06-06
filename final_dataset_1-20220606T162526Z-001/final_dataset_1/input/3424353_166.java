String unauthorized(ActionInvocation invocation, ApiKeyPermissionService.Status reason) throws IOException {
    ActionProxy proxy = invocation.getProxy();
    int httpCode = ResponseCodes.RESPONSE_UNAUTHORIZED;
    String message = "permission denied";
    switch (reason) {
      case UNAUTHORIZED:
        httpCode = ResponseCodes.RESPONSE_UNAUTHORIZED;
        break;
      case  RATE_EXCEEDED:
        httpCode = ResponseCodes.RESPONSE_TOO_MANY_REQUESTS;
        message = "rate limit exceeded";
        break;
      case  AUTHORIZED:
        // this should never happen!
        throw new IllegalStateException("Valid status code " + reason + " in unauthorized response");
      default:
        httpCode = ResponseCodes.RESPONSE_UNAUTHORIZED;
    }
    
    ResponseBean response = new ResponseBean(1, httpCode, message, null);
    DefaultHttpHeaders methodResult = new DefaultHttpHeaders().withStatus(response.getCode());
    return _handlerSelector.handleResult(proxy.getConfig(), methodResult, response);
  }
