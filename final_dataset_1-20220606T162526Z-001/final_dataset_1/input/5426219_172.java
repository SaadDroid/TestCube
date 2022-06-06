@Override
    public Map<String, String> properties() {
        return ImmutableMap.<String, String>builder()
                .putAll(super.properties())
                .put("designElement", designElementName)
                .build();
    }
