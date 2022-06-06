@Override
    public void processMessage(final Message message, final TestContext context) {
        if (message.getPayload() == null || !StringUtils.hasText(message.getPayload(String.class))) {
            return;
        }

        final Document doc = XMLUtils.parseMessagePayload(message.getPayload(String.class));

        if (doc == null) {
            throw new CitrusRuntimeException("Not able to set message elements, because no XML ressource defined");
        }

        for (final Entry<String, Object> entry : xPathExpressions.entrySet()) {
            final String pathExpression = entry.getKey();
            String valueExpression = entry.getValue().toString();

            //check if value expr is variable or function (and resolve it if yes)
            valueExpression = context.replaceDynamicContentInString(valueExpression);

            final Node node;
            if (XPathUtils.isXPathExpression(pathExpression)) {
                node = XPathUtils.evaluateAsNode(doc, pathExpression,
                                                context.getNamespaceContextBuilder().buildContext(message, Collections.emptyMap()));
            } else {
                node = XMLUtils.findNodeByName(doc, pathExpression);
            }

            if (node == null) {
                throw new UnknownElementException("Could not find element for expression" + pathExpression);
            }

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                //fix: otherwise there will be a new line in the output
                node.setTextContent(valueExpression);
            } else {
                node.setNodeValue(valueExpression);
            }

            if (log.isDebugEnabled()) {
                log.debug("Element " +  pathExpression + " was set to value: " + valueExpression);
            }
        }

        message.setPayload(XMLUtils.serialize(doc));
    }
