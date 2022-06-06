@Validate
    public void validate() {
        for (final Entry<String, String> entry : replacements.entrySet()) {
            final String searchString = entry.getKey();
            if (Strings.isNullOrEmpty(searchString)) {
                throw new IllegalArgumentException("Search string cannot be empty");
            }
            final String replacementString = entry.getValue();
            if (!replaceEntireString && replacementString.indexOf(searchString) != -1) {
                throw new IllegalArgumentException(
                        "Replacement string cannot contain the search string (implies an infinite replacement loop)");
            }
        }
    }
