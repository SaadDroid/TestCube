@CheckForNull
    @Override
    public String convertToPresentation(@CheckForNull LocalDateTime value,
            @CheckForNull Class<? extends String> targetType,
            @CheckForNull Locale locale) throws ConversionException {
        if (value == null) {
            return "";
        }
        String dateString = localDateConverter.convertToPresentation(value.toLocalDate(), targetType, locale);
        String timeString = DateTimeFormat.shortTime()
                .withLocale(JodaLocalDateToStringConverter.getNullsafeLocale(locale))
                .print(value);
        return dateString + '\t' + timeString;
    }
