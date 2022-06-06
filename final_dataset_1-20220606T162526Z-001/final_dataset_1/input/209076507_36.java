public static String unescape(String text) {
        Validate.notNull(text, "Text is null");

        for (Map.Entry<String, String> entry : ENTITIES.entrySet()) {
            text = StringUtils.replace(text, entry.getKey(), entry.getValue());
        }
        return text;
    }
