public static String cleanString(final String stringToClean) {
        String cleanResult = "";
        if (stringToClean != null) {
            cleanResult = REGEX_PASSWORD_QUERYSTRING.matcher(stringToClean).replaceAll("");
            cleanResult = REGEX_PASSWORD_JSON.matcher(cleanResult).replaceAll("");
            final Matcher detailsMatcher = REGEX_PASSWORD_DETAILS.matcher(cleanResult);
            while (detailsMatcher.find()) {
                final Matcher detailsIndexMatcher = REGEX_PASSWORD_DETAILS_INDEX.matcher(detailsMatcher.group());
                if (detailsIndexMatcher.find()) {
                    cleanResult = cleanDetails(cleanResult, detailsIndexMatcher.group());
                }
            }
        }
        return cleanResult;
    }
