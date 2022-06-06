public String getValue(String expression) {
        return getValue(expression, CastUtils.cast(Collections.emptyMap(), String.class, String.class));
    }
