@Override
    public void processMessage(Message message, TestContext context) {
        if (message.getPayload() == null || !StringUtils.hasText(message.getPayload(String.class))) {
            return;
        }

        String jsonPathExpression;
        try {
            JSONParser parser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
            Object jsonData = parser.parse(message.getPayload(String.class));
            DocumentContext documentContext = JsonPath.parse(jsonData);

            for (Map.Entry<String, Object> entry : jsonPathExpressions.entrySet()) {
                jsonPathExpression = entry.getKey();
                String valueExpression = context.replaceDynamicContentInString(entry.getValue().toString());

                Object value;
                if (valueExpression.equals("true")) {
                    value = true;
                } else if (valueExpression.equals("false")) {
                    value = false;
                } else {
                    try {
                        value = NumberUtils.parseNumber(valueExpression, Integer.class);
                    } catch (IllegalArgumentException e) {
                        value = valueExpression;
                    }
                }

                try {
                    documentContext.set(jsonPathExpression, value);
                } catch (PathNotFoundException e) {
                    if (!ignoreNotFound) {
                        throw new UnknownElementException(String.format("Could not find element for expression: %s", jsonPathExpression), e);
                    }
                }

                if (log.isDebugEnabled()) {
                    log.debug("Element " + jsonPathExpression + " was set to value: " + valueExpression);
                }
            }

            message.setPayload(jsonData.toString());
        } catch (ParseException e) {
            throw new CitrusRuntimeException("Failed to parse JSON text", e);
        }
    }
