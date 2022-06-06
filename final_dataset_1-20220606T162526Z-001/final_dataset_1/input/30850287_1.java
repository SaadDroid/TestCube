public int countWords(String words) {
        String[] separateWords = StringUtils.split(words, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }
