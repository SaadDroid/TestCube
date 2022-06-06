@Override
    @SuppressWarnings("unchecked")
    public void validateMessage(Message receivedMessage, Message controlMessage,
                                TestContext context, JsonMessageValidationContext validationContext) {
        if (controlMessage == null || controlMessage.getPayload() == null) {
            log.debug("Skip message payload validation as no control message was defined");
            return;
        }

        log.debug("Start JSON message validation ...");

        if (validationContext.isSchemaValidationEnabled()) {
            performSchemaValidation(receivedMessage, context, validationContext);
        }

        if (log.isDebugEnabled()) {
            log.debug("Received message:\n" + receivedMessage);
            log.debug("Control message:\n" + controlMessage);
        }

        String receivedJsonText = receivedMessage.getPayload(String.class);
        String controlJsonText = context.replaceDynamicContentInString(controlMessage.getPayload(String.class));

        try {
            if (!StringUtils.hasText(controlJsonText)) {
                log.debug("Skip message payload validation as no control message was defined");
                return;
            } else {
                Assert.isTrue(StringUtils.hasText(receivedJsonText), "Validation failed - " +
                		"expected message contents, but received empty message!");
            }

            JSONParser parser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);

            Object receivedJson = parser.parse(receivedJsonText);
            ReadContext readContext = JsonPath.parse(receivedJson);
            Object controlJson = parser.parse(controlJsonText);
            if (receivedJson instanceof JSONObject) {
                validateJson("$.", (JSONObject) receivedJson, (JSONObject) controlJson, validationContext, context, readContext);
            } else if (receivedJson instanceof JSONArray) {
                JSONObject tempReceived = new JSONObject();
                tempReceived.put("array", receivedJson);
                JSONObject tempControl = new JSONObject();
                tempControl.put("array", controlJson);

                validateJson("$.", tempReceived, tempControl, validationContext, context, readContext);
            } else {
                throw new CitrusRuntimeException("Unsupported json type " + receivedJson.getClass());
            }
        } catch (IllegalArgumentException e) {
            throw new ValidationException(String.format("Failed to validate JSON text:%n%s", receivedJsonText), e);
        } catch (ParseException e) {
            throw new CitrusRuntimeException("Failed to parse JSON text", e);
        }

        log.info("JSON message validation successful: All values OK");
    }
