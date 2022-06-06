@Override
    public boolean accept(Message message) {
        Document doc;

        try {
            doc = XMLUtils.parseMessagePayload(getPayloadAsString(message));
        } catch (LSException e) {
            log.warn("Ignoring non XML message for XPath message selector (" + e.getClass().getName() + ")");
            return false; // non XML message - not accepted
        }

        try {
            Map<String, String> namespaces = XMLUtils.lookupNamespaces(doc);

            // add default namespace mappings
            namespaces.putAll(context.getNamespaceContextBuilder().getNamespaceMappings());

            String value;
            if (XPathUtils.hasDynamicNamespaces(selectKey)) {
                namespaces.putAll(XPathUtils.getDynamicNamespaces(selectKey));
                value = XPathExpressionFactory.createXPathExpression(XPathUtils.replaceDynamicNamespaces(selectKey, namespaces), namespaces)
                        .evaluateAsString(doc);
            } else {
                value = XPathExpressionFactory.createXPathExpression(selectKey, namespaces)
                        .evaluateAsString(doc);
            }

            return evaluate(value);
        } catch (XPathParseException e) {
            log.warn("Could not evaluate XPath expression for message selector - ignoring message (" + e.getClass().getName() + ")");
            return false; // wrong XML message - not accepted
        }
    }
