public static String[] getArray(String key, String splitStr) {
        String value = getString(key);
        if (value == null || StringUtils.isEmpty(splitStr)) {
            return null;
        }
        try {
            return value.split(splitStr);
        } catch (PatternSyntaxException e) {
            logger.info(e.getMessage(),e);
        }
        return null;
    }
