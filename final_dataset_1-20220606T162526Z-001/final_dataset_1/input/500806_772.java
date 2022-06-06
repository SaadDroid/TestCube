@Override
    public HttpMessage convertInbound(HttpEntity<?> message,
                                      HttpEndpointConfiguration endpointConfiguration,
                                      TestContext context) {
        Map<String, Object> mappedHeaders = endpointConfiguration.getHeaderMapper().toHeaders(message.getHeaders());
        HttpMessage httpMessage = new HttpMessage(extractMessageBody(message), convertHeaderTypes(mappedHeaders));

        for (Map.Entry<String, String> customHeader : getCustomHeaders(message.getHeaders(), mappedHeaders).entrySet()) {
            httpMessage.setHeader(customHeader.getKey(), customHeader.getValue());
        }

        if (message instanceof ResponseEntity<?>) {
            httpMessage.status(((ResponseEntity<?>) message).getStatusCode());

            // We've no information here about the HTTP Version in this context.
            // Because HTTP/2 is not supported anyways currently, this should be acceptable.
            httpMessage.version("HTTP/1.1");

            if (endpointConfiguration.isHandleCookies()) {
                httpMessage.setCookies(cookieConverter.convertCookies(message));
            }
        }

        return httpMessage;
    }
