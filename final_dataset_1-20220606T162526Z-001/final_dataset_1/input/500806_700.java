@Override
    public org.springframework.web.socket.WebSocketMessage convertOutbound(Message message, WebSocketEndpointConfiguration endpointConfiguration, TestContext context) {
        WebSocketMessage internalMessage;
        if (message instanceof WebSocketMessage) {
            internalMessage = (WebSocketMessage) message;
        } else {
            internalMessage = new WebSocketMessage(message);
        }

        org.springframework.web.socket.WebSocketMessage webSocketMessage;
        Object payload = internalMessage.getPayload();
        if (payload instanceof String) {
            webSocketMessage = new TextMessage(payload.toString(), internalMessage.isLast());
        } else if (payload instanceof ByteBuffer) {
            webSocketMessage = new BinaryMessage((ByteBuffer) payload, internalMessage.isLast());
        } else if (payload instanceof byte[]) {
            webSocketMessage = new BinaryMessage((byte[]) payload, internalMessage.isLast());
        } else {
            try {
                webSocketMessage = new TextMessage(internalMessage.getPayload(String.class), internalMessage.isLast());
            } catch (ConversionNotSupportedException e) {
                throw new CitrusRuntimeException(String.format("Found unsupported payload type: '%s'", payload.getClass().getCanonicalName()), e);
            }
        }

        convertOutbound(webSocketMessage, internalMessage, endpointConfiguration, context);
        return webSocketMessage;
    }
