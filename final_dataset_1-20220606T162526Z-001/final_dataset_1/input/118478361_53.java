protected ZonedDateTime makeZonedDateTime(String literal) {
        if (StringUtils.isBlank(literal)) {
            return null;
        }

        literal = fixDateTimeFormat(literal);
        if (hasZone(literal)) {
            return ZonedDateTime.parse(literal, FEEL_DATE_TIME_FORMAT);
        } else if (hasOffset(literal)) {
            return ZonedDateTime.parse(literal, FEEL_DATE_TIME_FORMAT);
        } else if (hasTime(literal)) {
            return ZonedDateTime.parse(literal + 'Z', FEEL_DATE_TIME_FORMAT);
        } else {
            LocalDate localDate = LocalDate.parse(literal, FEEL_DATE_FORMAT);
            return localDate.atStartOfDay(UTC);
        }
    }
