@Override
    public void validateMessage(Message receivedMessage, Message controlMessage,
                                TestContext context, XmlMessageValidationContext validationContext) throws ValidationException {
        log.debug("Start XML message validation ...");

        try {
            if (validationContext.isSchemaValidationEnabled()) {
                validateXMLSchema(receivedMessage, context, validationContext);
                validateDTD(validationContext.getDTDResource(), receivedMessage);
            }

            validateNamespaces(validationContext.getControlNamespaces(), receivedMessage);
            validateMessageContent(receivedMessage, controlMessage, validationContext, context);

            if (controlMessage != null) {
                Assert.isTrue(controlMessage.getHeaderData().size() <= receivedMessage.getHeaderData().size(),
                        "Failed to validate header data XML fragments - found " +
                                receivedMessage.getHeaderData().size() + " header fragments, expected " + controlMessage.getHeaderData().size());

                for (int i = 0; i < controlMessage.getHeaderData().size(); i++) {
                    validateXmlHeaderFragment(receivedMessage.getHeaderData().get(i),
                            controlMessage.getHeaderData().get(i), validationContext, context);
                }

            }

            log.info("XML message validation successful: All values OK");
        } catch (ClassCastException | DOMException | LSException e) {
            throw new CitrusRuntimeException(e);
        } catch (IllegalArgumentException e) {
            log.error("Failed to validate:\n" + XMLUtils.prettyPrint(receivedMessage.getPayload(String.class)));
            throw new ValidationException("Validation failed:", e);
        } catch (ValidationException ex) {
            log.error("Failed to validate:\n" + XMLUtils.prettyPrint(receivedMessage.getPayload(String.class)));
            throw ex;
        }
    }
