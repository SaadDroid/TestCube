@Override
    public boolean accept(Message<?> message) {
        MessageHeaders messageHeaders = message.getHeaders();

        Map<String, Object> nestedMessageHeaders = new HashMap<>();
        if (message.getPayload() instanceof com.consol.citrus.message.Message) {
            nestedMessageHeaders = ((com.consol.citrus.message.Message) message.getPayload()).getHeaders();
        }

        if (nestedMessageHeaders.containsKey(selectKey)) {
            return matchHeader(nestedMessageHeaders);
        } else if (messageHeaders.containsKey(selectKey)) {
            return matchHeader(messageHeaders);
        } else {
            return false;
        }
    }
