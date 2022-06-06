public MultivaluedMap<String, String> getRequestHeaders() {
        boolean splitIndividualValue
            = MessageUtils.getContextualBoolean(message, HEADER_SPLIT_PROPERTY, false);
        if (splitIndividualValue) {
            Map<String, List<String>> newHeaders =
                new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
                newHeaders.put(entry.getKey(), getRequestHeader(entry.getKey()));
            }
            return new MetadataMap<String, String>(Collections.unmodifiableMap(newHeaders), false);
        }
        return new MetadataMap<String, String>(Collections.unmodifiableMap(headers), false);
    }
