@Override
    public HttpEntity<?> convertOutbound(Message message,
                                         HttpEndpointConfiguration endpointConfiguration,
                                         TestContext context) {

        HttpMessage httpMessage = convertOutboundMessage(message);

        HttpHeaders httpHeaders = createHttpHeaders(httpMessage, endpointConfiguration);

        Object payload = httpMessage.getPayload();
        if (httpMessage.getStatusCode() != null) {
            return new ResponseEntity<>(payload, httpHeaders, httpMessage.getStatusCode());
        } else {
            for (Cookie cookie : httpMessage.getCookies()) {
                httpHeaders.add(
                        HttpHeaders.COOKIE,
                        cookie.getName() + "=" + context.replaceDynamicContentInString(cookie.getValue()));
            }
        }

        HttpMethod method = determineHttpMethod(endpointConfiguration, httpMessage);

        return createHttpEntity(httpHeaders, payload, method);
    }
