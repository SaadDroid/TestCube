public static String collectPath(String... pathParts) {
        final StringBuilder sb = new StringBuilder();
        for (String item : pathParts) {
            if (StringUtils.isBlank(item)) {
                continue;
            }
            final String path = trimPath(item);
            if (StringUtils.isNotBlank(path)) {
                sb.append(SLASH).append(path);
            }
        }
        return sb.length() > 0 ? sb.toString() : String.valueOf(SLASH);
    }
