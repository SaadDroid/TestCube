@Override
    public String[] split(String text) {
        Matcher matcher = REGEX_BLANK_LINE.matcher(text);
        text = matcher.replaceAll("");

        return REGEX_PARAGRAPH.split(text);
    }
