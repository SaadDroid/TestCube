public static String removeSessionId(String originalUrl) {
        if (originalUrl == null) {
            return null;
        }
        return SESSION_ID_PATTERN.matcher(originalUrl).replaceAll("").replaceAll("\\?$", "").replaceAll("\\?&", "?");
    }
