public URI getBaseURI() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("xml", XML_NAMESPACE);
        return getLink("/*/@xml:base", map);
    }
