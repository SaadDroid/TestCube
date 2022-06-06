public static LocalDate bigDecimalToLocalDate(BigDecimal value, ZoneId defaultTimeZone)
    {
        Date dateTransformedValue = bigDecimalToDate(value);
        if (dateTransformedValue == null) {
            return null;
        }
        return dateTransformedValue.toInstant()
                .atZone(defaultTimeZone)
                .toLocalDate();
    }
