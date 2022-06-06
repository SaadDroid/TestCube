@Override
    public void validateMessage(Message receivedMessage, Message controlMessage, TestContext context, XpathMessageValidationContext validationContext) throws ValidationException {
        if (CollectionUtils.isEmpty(validationContext.getXpathExpressions())) { return; }

        if (receivedMessage.getPayload() == null || !StringUtils.hasText(receivedMessage.getPayload(String.class))) {
            throw new ValidationException("Unable to validate message elements - receive message payload was empty");
        }

        log.debug("Start XPath element validation ...");

        Document received = XMLUtils.parseMessagePayload(receivedMessage.getPayload(String.class));
        NamespaceContext namespaceContext = namespaceContextBuilder.buildContext(
                receivedMessage, validationContext.getNamespaces());

        for (Map.Entry<String, Object> entry : validationContext.getXpathExpressions().entrySet()) {
            String xPathExpression = entry.getKey();
            Object expectedValue = entry.getValue();

            xPathExpression = context.replaceDynamicContentInString(xPathExpression);

            Object xPathResult;
            if (XPathUtils.isXPathExpression(xPathExpression)) {
                XPathExpressionResult resultType = XPathExpressionResult.fromString(
                        xPathExpression, XPathExpressionResult.NODE);
                xPathExpression = XPathExpressionResult.cutOffPrefix(xPathExpression);

                //Give ignore elements the chance to prevent the validation in case result type is node
                if (resultType.equals(XPathExpressionResult.NODE) &&
                        XmlValidationUtils.isElementIgnored(XPathUtils.evaluateAsNode(received, xPathExpression, namespaceContext),
                                validationContext.getIgnoreExpressions(),
                                namespaceContext)) {
                    continue;
                }

                xPathResult = XPathUtils.evaluate(received,
                        xPathExpression,
                        namespaceContext,
                        resultType);
            } else {
                Node node = XMLUtils.findNodeByName(received, xPathExpression);

                if (node == null) {
                    throw new UnknownElementException(
                            "Element ' " + xPathExpression + "' could not be found in DOM tree");
                }

                if (XmlValidationUtils.isElementIgnored(node, validationContext.getIgnoreExpressions(), namespaceContext)) {
                    continue;
                }

                xPathResult = getNodeValue(node);
            }

            if (expectedValue instanceof String) {
                //check if expected value is variable or function (and resolve it, if yes)
                expectedValue = context.replaceDynamicContentInString(String.valueOf(expectedValue));
            }

            //do the validation of actual and expected value for element
            ValidationUtils.validateValues(xPathResult, expectedValue, xPathExpression, context);

            if (log.isDebugEnabled()) {
                log.debug("Validating element: " + xPathExpression + "='" + expectedValue + "': OK.");
            }
        }

        log.info("XPath element validation successful: All elements OK");
    }
