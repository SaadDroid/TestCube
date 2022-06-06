public static String wordToSingularEnglish(String pluralForm) {
        String plural = pluralForm;

        if (plural == null) {
            return "";
        }

        String singular = plural;

        // check exceptions where no rules apply to transformation
        if (getIrregularNouns().containsValue(plural)) {
            singular = IRREGULAR_NOUNS_REVERSE.get(singular);

            if (StringHelper.startsUppercase(plural)) {
                singular = StringHelper.upperCaseFirstLetter(singular);
            }
            return singular;
        }

        if (singular.length() < 4) {
            return singular;
        }

        // substitute ices with x
        if (plural.toLowerCase().endsWith("ices")) {
            return plural.substring(0, plural.length() - 4) + "ix";
        }

        // substitute ies with y after consonants
        if (plural.toLowerCase().endsWith("ies")) {
            return plural.substring(0, plural.length() - 3) + "y";
        }

        // substitute ves with f or fe
        if (plural.toLowerCase().endsWith("ves")) {
            char letterBeforeVES = plural.substring(plural.length() - 3, plural.length() - 2).charAt(0);
            plural = plural.substring(0, plural.length() - 3) + "f";
            if (!StringHelper.isVowel(letterBeforeVES)
                    && StringHelper.isVowel(plural.substring(plural.length() - 2, plural.length() - 1).charAt(0))) {
                plural += "e";
            }
            return plural;
        }

        // remove es
        if (plural.toLowerCase().endsWith("es") && plural.length() >= 5) {
            String lettersBeforeES = plural.substring(plural.length() - 4, plural.length() - 2);
            String letterBeforeES = lettersBeforeES.substring(1);
            if (lettersBeforeES.equalsIgnoreCase("ss") || lettersBeforeES.equalsIgnoreCase("ch")
                    || lettersBeforeES.equalsIgnoreCase("sh") || letterBeforeES.equalsIgnoreCase("x")
                    || StringHelper.isVowel(letterBeforeES.charAt(0))) {
                return plural.substring(0, plural.length() - 2);
            }
        }

        // remove s
        if (plural.toLowerCase().endsWith("s")) {
            return plural.substring(0, plural.length() - 1);
        }

        return plural;
    }
