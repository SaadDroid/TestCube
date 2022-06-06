public static char[] replacePatternCharacter(Integer codePointToReplace, Random random) {
        for (CharPattern charPattern : CharPattern.values()) {
            if (charPattern.getReplaceChar().charValue() == codePointToReplace) {
                int length = charPattern.getCodePointSize();
                int position = random.nextInt(length);
                return Character.toChars(charPattern.getCodePointAt(position));
            }
        }
        return Character.toChars(codePointToReplace);
    }
