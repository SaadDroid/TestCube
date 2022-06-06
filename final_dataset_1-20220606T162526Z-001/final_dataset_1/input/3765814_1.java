public static <T> T getOtherAttribute(Map<QName, String> otherAttributes, String attributeName) {
        T otherAttribute = null;
        for (QName qname : otherAttributes.keySet()) {
            String value = otherAttributes.get(qname);
            String key = qname.getLocalPart();
            LOG.debug("Attribute: " + key + " : " + value);
            if (key.equalsIgnoreCase(attributeName)) {
                otherAttribute = (T) value;
            }
        }
        return otherAttribute;
    }
