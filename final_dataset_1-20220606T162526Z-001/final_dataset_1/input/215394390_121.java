public static String inferDateTimeFormat(String value)
    {
        for (String datetimeFormat : SUPPORTED_DATETIME_FORMAT) {
            try {
                DateUtils.parseDate(value, datetimeFormat);
                logger.info("Inferred format {} for value {}", datetimeFormat, value);
                return datetimeFormat;
            }
            catch (ParseException ex) {
                continue;
            }
        }
        logger.warn("Failed to infer format for {}", value);
        return null;
    }
