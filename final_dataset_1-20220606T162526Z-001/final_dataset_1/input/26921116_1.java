@Override
    public String stem(String word) {
        // Convert input to lowercase and remove all chars that are not a letter.
        word = cleanup(word.toLowerCase());

        //if str's length is greater than 2 then remove prefixes
        if ((word.length() > 3) && (stripPrefix)) {
            word = stripPrefixes(word);
        }

        // if str is not null remove suffix
        if (word.length() > 3) {
            word = stripSuffixes(word);
        }

        return word;
    }
