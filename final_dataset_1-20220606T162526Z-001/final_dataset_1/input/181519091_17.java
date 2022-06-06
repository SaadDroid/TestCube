public static void contains(String sequence, String searchSequence, String property, String messagePrefix, Errors error) {
        if (!StringUtils.contains(sequence, searchSequence)) {
            error.rejectValue(property, messagePrefix + " should contain sequence \"" + searchSequence + "\"");
        }
    }
