@Override
    public String[] split(String text) {
        if (splitContraction) {
            text = WONT_CONTRACTION.matcher(text).replaceAll("$1ill not");
            text = SHANT_CONTRACTION.matcher(text).replaceAll("$1ll not");
            text = AINT_CONTRACTION.matcher(text).replaceAll("$1m not");

            for (Pattern regexp : NOT_CONTRACTIONS) {
                text = regexp.matcher(text).replaceAll("$1 not");
            }

            for (Pattern regexp : CONTRACTIONS2) {
                text = regexp.matcher(text).replaceAll("$1 $2");
            }

            for (Pattern regexp : CONTRACTIONS3) {
                text = regexp.matcher(text).replaceAll("$1 $2 $3");
            }
        }

        text = DELIMITERS[0].matcher(text).replaceAll(" $1 ");
        text = DELIMITERS[1].matcher(text).replaceAll(" $1");
        text = DELIMITERS[2].matcher(text).replaceAll(" $1");
        text = DELIMITERS[3].matcher(text).replaceAll(" . ");
        text = DELIMITERS[4].matcher(text).replaceAll(" $1 ");

        String[] words = WHITESPACE.split(text);
        if (words.length > 1 && words[words.length-1].equals(".")) {
            if (EnglishAbbreviations.contains(words[words.length-2])) {
                words[words.length-2] = words[words.length-2] + ".";
            }
        }
        
        ArrayList<String> result = new ArrayList<>();
        for (String token : words) {
            if (!token.isEmpty()) {
                result.add(token);
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
