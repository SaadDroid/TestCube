@Override
    public void validateMessage(Message receivedMessage, Message controlMessage,
                                TestContext context, ValidationContext validationContext) throws ValidationException {
        if (controlMessage == null || controlMessage.getPayload() == null) {
            log.debug("Skip message payload validation as no control message was defined");
            return;
        }

        log.debug("Start text message validation");

        if (log.isDebugEnabled()) {
            log.debug("Received message:\n" + receivedMessage);
            log.debug("Control message:\n" + controlMessage);
        }

        try {
            String resultValue = normalizeWhitespace(receivedMessage.getPayload(String.class).trim());
            String controlValue = normalizeWhitespace(context.replaceDynamicContentInString(controlMessage.getPayload(String.class).trim()));

            controlValue = processIgnoreStatements(controlValue, resultValue);
            controlValue = processVariableStatements(controlValue, resultValue, context);

            if (ValidationMatcherUtils.isValidationMatcherExpression(controlValue)) {
                ValidationMatcherUtils.resolveValidationMatcher("payload", resultValue, controlValue, context);
                return;
            } else {
                validateText(resultValue, controlValue);
            }
        } catch (IllegalArgumentException e) {
            throw new ValidationException("Failed to validate text content", e);
        }

        log.info("Text validation successful: All values OK");
    }
