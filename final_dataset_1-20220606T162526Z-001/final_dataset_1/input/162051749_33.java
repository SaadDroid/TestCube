static String extractIdentifier(String permalink) {
        if (StringUtils.isNotEmpty(permalink)) {
            Matcher matcher = URL_STATUS_PATTERN.matcher(permalink);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }
