protected void validateNamespaces(Map<String, String> expectedNamespaces, Message receivedMessage) {
        if (CollectionUtils.isEmpty(expectedNamespaces)) { return; }

        if (receivedMessage.getPayload() == null || !StringUtils.hasText(receivedMessage.getPayload(String.class))) {
            throw new ValidationException("Unable to validate message namespaces - receive message payload was empty");
        }

        log.debug("Start XML namespace validation");

        Document received = XMLUtils.parseMessagePayload(receivedMessage.getPayload(String.class));

        Map<String, String> foundNamespaces = NamespaceContextBuilder.lookupNamespaces(receivedMessage.getPayload(String.class));

        if (foundNamespaces.size() != expectedNamespaces.size()) {
            throw new ValidationException("Number of namespace declarations not equal for node " +
                    XMLUtils.getNodesPathName(received.getFirstChild()) + " found " +
                    foundNamespaces.size() + " expected " + expectedNamespaces.size());
        }

        for (Entry<String, String> entry : expectedNamespaces.entrySet()) {
            String namespace = entry.getKey();
            String url = entry.getValue();

            if (foundNamespaces.containsKey(namespace)) {
                if (!foundNamespaces.get(namespace).equals(url)) {
                    throw new ValidationException("Namespace '" + namespace +
                            "' values not equal: found '" + foundNamespaces.get(namespace) +
                            "' expected '" + url + "' in reference node " +
                            XMLUtils.getNodesPathName(received.getFirstChild()));
                } else {
                    if (log.isDebugEnabled()) {
                        log.debug("Validating namespace " + namespace + " value as expected " + url + " - value OK");
                    }
                }
            } else {
                throw new ValidationException("Missing namespace " + namespace + "(" + url + ") in node " +
                        XMLUtils.getNodesPathName(received.getFirstChild()));
            }
        }

        log.info("XML namespace validation successful: All values OK");
    }
