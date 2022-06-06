@Override
    public void convertOutbound(WebServiceMessage webServiceMessage, Message message, WebServiceEndpointConfiguration endpointConfiguration, TestContext context) {
        super.convertOutbound(webServiceMessage, message, endpointConfiguration, context);

        SoapMessage soapMessage = (SoapMessage) webServiceMessage;
        URI messageId;
        if (message.getHeader(WsAddressingMessageHeaders.MESSAGE_ID) != null) {
            messageId = URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.MESSAGE_ID).toString()));
        } else if (addressingHeaders.getMessageId() != null) {
            messageId = addressingHeaders.getMessageId();
        } else {
            messageId = messageIdStrategy.newMessageId(soapMessage);
        }

        EndpointReference from = addressingHeaders.getFrom();
        if (message.getHeader(WsAddressingMessageHeaders.FROM) != null) {
            from = new EndpointReference(URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.FROM).toString())));
        }

        URI to = addressingHeaders.getTo();
        if (message.getHeader(WsAddressingMessageHeaders.TO) != null) {
            to = URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.TO).toString()));
        }

        URI action = addressingHeaders.getAction();
        if (message.getHeader(WsAddressingMessageHeaders.ACTION) != null) {
            action = URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.ACTION).toString()));
        }

        EndpointReference replyTo = addressingHeaders.getReplyTo();
        if (message.getHeader(WsAddressingMessageHeaders.REPLY_TO) != null) {
            replyTo = new EndpointReference(URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.REPLY_TO).toString())));
        }

        EndpointReference faultTo = addressingHeaders.getReplyTo();
        if (message.getHeader(WsAddressingMessageHeaders.FAULT_TO) != null) {
            faultTo = new EndpointReference(URI.create(context.replaceDynamicContentInString(message.getHeader(WsAddressingMessageHeaders.FAULT_TO).toString())));
        }

        MessageAddressingProperties map =
                new MessageAddressingProperties(to,
                        from,
                        replyTo,
                        faultTo,
                        action,
                        messageId);

        AddressingVersion version;
        // avoid NPE
        if (WsAddressingVersion.VERSION10.equals(addressingHeaders.getVersion())) {
            version = new Addressing10();
        } else if (WsAddressingVersion.VERSION200408.equals(addressingHeaders.getVersion())) {
            version = new Addressing200408();
        } else {
            throw new CitrusRuntimeException("Unsupported ws addressing version '" +
                    addressingHeaders.getVersion() + "'");
        }

        version.addAddressingHeaders(soapMessage, map);
    }
