public static String getThirdPersonSingular(String verb) {

        if (verb.isEmpty()) {
            return verb;
        }

        verb = verb.toLowerCase();

        // exceptions
        if (verb.equals("be")) {
            return "is";
        } else if (verb.equals("was")) {
            return "was";
        } else if (verb.equals("been")) {
            return "been";
        }

        if (verb.equals("have")) {
            return "has";
        }

        Set<String> stay = new HashSet<>(Arrays.asList("can", "could", "will", "would", "may", "might", "shall",
                "should", "must"));
        if (stay.contains(verb)) {
            return verb;
        }

        String stemmedWord = stemEnglishWord(verb);
        EnglishVerb englishVerb = IRREGULAR_VERBS.get(stemmedWord);

        if (englishVerb != null) {
            if (englishVerb.getSimplePast().equals(verb) || englishVerb.getPastParticiple().equals(verb)) {
                return verb;
            }
            verb = englishVerb.getPresent();
        }

        // regular verbs in past stay as they are
        if (englishVerb == null && verb.endsWith("ed")) {
            return verb;
        }

        char letterLast = verb.charAt(verb.length() - 1);
        char letterBeforeLast = verb.charAt(verb.length() - 2);

        if (verb.endsWith("ch") || verb.endsWith("sh") || verb.endsWith("x") || verb.endsWith("o")) {
            return verb + "es";
        }

        if (!StringHelper.isVowel(letterBeforeLast) && (verb.endsWith("s") || verb.endsWith("z"))) {
            return verb + "es";
        }

        if (StringHelper.isVowel(letterBeforeLast) && (verb.endsWith("s") || verb.endsWith("z"))) {
            return verb + letterLast + "es";
        }

        if (!StringHelper.isVowel(letterBeforeLast) && verb.endsWith("y")) {
            return verb.replaceAll("y$", "ies");
        }

        return verb + "s";
    }
