public void doWithMessage(WebServiceMessage requestMessage) throws IOException, TransformerException {
        endpointConfiguration.getMessageConverter().convertOutbound(requestMessage, message, endpointConfiguration, context);
    }
