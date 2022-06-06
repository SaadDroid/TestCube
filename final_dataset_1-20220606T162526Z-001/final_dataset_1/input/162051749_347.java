public static List<String> splitGermanCompoundWords(String word) {
        List<String> words = new ArrayList<>();

        word = word.toLowerCase();

        // try to divide the word in its two longest subwords and transform the last one, e.g. "Goldketten" ->
        // "Gold" "Ketten" -> "Kette" => "Goldkette"
        String lcSingular = wordToSingularGermanCaseSensitive(word);
        int wordLength = lcSingular.length();

        for (int i = 0; i < GERMAN_WORDS.size(); i++) {
            String word2 = GERMAN_WORDS.get(i);
            int word2Length = word2.length();

            if ((word2Length > 3 && (word2.length() <= wordLength || !words.isEmpty())) && lcSingular.endsWith(word2)) {
                words.add(0, word2);
                lcSingular = lcSingular.replace(word2, "");
                if (lcSingular.isEmpty()) {
                    break;
                }
                // we reset to the beginning of the queue because the next word could be longer than the current match
                i = 0;
            }
        }

        // if we could not completely split the word we leave it
        // if (!lcSingular.isEmpty()) {
        // words.clear();
        // words.add(word);
        // }
        if (!lcSingular.isEmpty()) {
            words.add(0, lcSingular);
        }

        return words;
    }
