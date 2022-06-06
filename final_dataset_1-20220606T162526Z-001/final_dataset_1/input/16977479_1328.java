public URI getLink(String expression) {
        return getLink(expression, CastUtils.cast(Collections.emptyMap(), String.class, String.class));
    }
