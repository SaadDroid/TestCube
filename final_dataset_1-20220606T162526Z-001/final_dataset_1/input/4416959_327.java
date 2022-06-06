public Element attributeNS(String namespace, String attributeName, String attributeValue)
    {
        ensureCurrentElement();

        current.attribute(namespace, attributeName, attributeValue);

        return current;
    }
