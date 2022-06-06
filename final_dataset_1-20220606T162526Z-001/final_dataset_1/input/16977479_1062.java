static String toString(Map<String, List<Object>> headers, boolean logSensitiveHeaders) {
        Map<String, List<Object>> filteredHeaders = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        filteredHeaders.putAll(headers);
        if (!logSensitiveHeaders) {
            for (String filteredKey : SENSITIVE_HEADERS) {
                filteredHeaders.put(filteredKey, SENSITIVE_HEADER_MARKER);
            }
        }
        return filteredHeaders.toString();
    }
