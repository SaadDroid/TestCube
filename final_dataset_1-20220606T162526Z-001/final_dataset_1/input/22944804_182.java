@Override
    public Map<Locale, String> transform(Set<String> values, Class<?> parameterType) {
        Map<Locale, String> messageTranslations = new HashMap<>();

        for (String value : values) {
            Matcher matcher = LOCALE_MESSAGE_PATTERN.matcher(value);

            if (!matcher.matches()) {
                throw new IllegalArgumentException(
                        "Expected format locale|message but got " + value);
            }

            String localeString = matcher.group(1);
            String message = matcher.group(2);

            messageTranslations.put(getLocale(localeString), message);
        }

        return messageTranslations;
    }
