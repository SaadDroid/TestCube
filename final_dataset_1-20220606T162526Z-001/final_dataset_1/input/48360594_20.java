public static boolean matchCharDatePattern(String value, String pattern) {

        if (value == null)
            return false;

        Set<String> patterns = new HashSet<>();
        for (AbstractPatternRecognizer patternRecognizer : patternRecognizerList)
            patterns.addAll(patternRecognizer.getValuePattern(value));

        // --- a value matching both a date pattern and a char pattern should not match with the char pattern
        if (!isDatePattern(pattern) && containsDatePattern(patterns))
            return false;

        return patterns.contains(pattern);
    }
