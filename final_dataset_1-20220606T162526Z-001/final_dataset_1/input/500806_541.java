@Override
    public void validateMessage(Message receivedMessage, Message controlMessage,
                                TestContext context, ValidationContext validationContext) {
        if (controlMessage == null || controlMessage.getPayload() == null) {
            log.debug("Skip message payload validation as no control message was defined");
            return;
        }

        if (StringUtils.hasText(controlMessage.getPayload(String.class))) {
            throw new ValidationException("Empty message validation failed - control message is not empty!");
        }

        log.debug("Start to verify empty message payload ...");

        if (log.isDebugEnabled()) {
            log.debug("Received message:\n" + receivedMessage);
            log.debug("Control message:\n" + controlMessage);
        }

        if (StringUtils.hasText(receivedMessage.getPayload(String.class))) {
            throw new ValidationException("Validation failed - received message content is not empty!") ;
        }

        log.info("Message payload is empty as expected: All values OK");
    }
