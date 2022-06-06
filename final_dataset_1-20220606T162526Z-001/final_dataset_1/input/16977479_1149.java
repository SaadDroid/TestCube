public void addSensitiveElementNames(final Set<String> inSensitiveElementNames) {
        for (final String sensitiveName : inSensitiveElementNames) {
            addReplacementPair(MATCH_PATTERN_XML_TEMPLATE, REPLACEMENT_XML_TEMPLATE, sensitiveName, replacementsXML);
            addReplacementPair(MATCH_PATTERN_JSON_TEMPLATE, REPLACEMENT_JSON_TEMPLATE, sensitiveName, replacementsJSON);
        }
    }
