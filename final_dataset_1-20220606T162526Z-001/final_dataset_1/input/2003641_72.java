public static String parsePath(String uri, Map<String, String> patterns) {
        if (uri == null) {
            return null;
        } else if (StringUtils.isBlank(uri)) {
            return String.valueOf(SLASH);
        }
        CharacterIterator ci = new StringCharacterIterator(uri);
        StringBuilder pathBuffer = new StringBuilder();
        char c = ci.first();
        if (c == CharacterIterator.DONE) {
            return String.valueOf(SLASH);
        }
        do {
            if (c == OPEN) {
                String regexBuffer = cutParameter(ci, patterns);
                if (regexBuffer == null) {
                    LOGGER.warn("Operation path \"{}\" contains syntax error.", uri);
                    return null;
                }
                pathBuffer.append(regexBuffer);
            } else {
                int length = pathBuffer.length();
                if (!(c == SLASH && (length != 0 && pathBuffer.charAt(length - 1) == SLASH))) {
                    pathBuffer.append(c);
                }
            }
        } while ((c = ci.next()) != CharacterIterator.DONE);
        return pathBuffer.toString();
    }
