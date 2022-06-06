public static Set<CharPattern> getCharPatterns(List<Integer> codePoints, List<Integer> filteredCodepoints) {
        Set<CharPattern> charPatternSet = new TreeSet<>();

        for (Integer codepoint : codePoints) {
            CharPattern charPattern = getCharPattern(codepoint);
            if (charPattern != null) {
                charPatternSet.add(charPattern);
                filteredCodepoints.add(codepoint);
            }
        }
        return charPatternSet;
    }
