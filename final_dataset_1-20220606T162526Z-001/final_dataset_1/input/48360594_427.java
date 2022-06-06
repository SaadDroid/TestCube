protected static Stream<String> convert(Stream<String> katakanaStream) {

        return katakanaStream.map(katakanaToken -> {
            String fullWidth = KanaUtils.half2FullKatakana(katakanaToken);
            String specialCharacters = handleSpecialCharacters(fullWidth);
            final IntStream intStream =
                    handleChoonpu(specialCharacters).codePoints().map(KatakanaToHiragana::toHiragana);
            return intStream
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
        });
    }
