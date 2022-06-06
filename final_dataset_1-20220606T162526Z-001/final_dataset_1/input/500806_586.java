protected void configureMessageEndpoint(ApplicationContext context) {
        if (context.containsBean(MESSAGE_ENDPOINT_BEAN_NAME)) {
            WebServiceEndpoint messageEndpoint = context.getBean(MESSAGE_ENDPOINT_BEAN_NAME, WebServiceEndpoint.class);

            EndpointAdapter endpointAdapter = webServiceServer.getEndpointAdapter();
            if (endpointAdapter != null) {
                messageEndpoint.setEndpointAdapter(endpointAdapter);
            }

            WebServiceEndpointConfiguration endpointConfiguration = new WebServiceEndpointConfiguration();
            endpointConfiguration.setHandleMimeHeaders(webServiceServer.isHandleMimeHeaders());
            endpointConfiguration.setHandleAttributeHeaders(webServiceServer.isHandleAttributeHeaders());
            endpointConfiguration.setKeepSoapEnvelope(webServiceServer.isKeepSoapEnvelope());
            endpointConfiguration.setMessageConverter(webServiceServer.getMessageConverter());
            messageEndpoint.setEndpointConfiguration(endpointConfiguration);

            if (StringUtils.hasText(webServiceServer.getSoapHeaderNamespace())) {
                messageEndpoint.setDefaultNamespaceUri(webServiceServer.getSoapHeaderNamespace());
            }

            if (StringUtils.hasText(webServiceServer.getSoapHeaderPrefix())) {
                messageEndpoint.setDefaultPrefix(webServiceServer.getSoapHeaderPrefix());
            }
        }
    }
