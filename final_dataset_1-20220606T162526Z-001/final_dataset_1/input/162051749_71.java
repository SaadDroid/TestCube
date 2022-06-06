public static double parseDms(String dmsString) {
        Validate.notEmpty(dmsString, "dmsString must not be empty");
        Matcher matcher = PATTERN_PARSE_DMS.matcher(dmsString);
        if (!matcher.matches()) {
            throw new NumberFormatException("The string " + dmsString + " could not be parsed in DMS format.");
        }
        double degrees = Double.parseDouble(matcher.group(1)); // degree value, including sign
        int sign; // the sign, determined either from hemisphere/meridien, or degree sign
        String ws = matcher.group(4);
        if (ws != null) {
            sign = "W".equals(ws) || "S".equals(ws) || "West".equals(ws) || "South".equals(ws) ? -1 : 1;
        } else {
            sign = matcher.group(1).startsWith("-") ? -1 : 1;
        }
        double minutes = matcher.group(2) != null ? Double.parseDouble(matcher.group(2)) : 0;
        double seconds = matcher.group(3) != null ? Double.parseDouble(matcher.group(3)) : 0;
        return sign * (Math.abs(degrees) + minutes / 60. + seconds / 3600.);
    }
