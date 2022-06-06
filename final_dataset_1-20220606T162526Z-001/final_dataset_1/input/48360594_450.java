public String transform(String str) {
        TokenizedString tokenizedString = new TokenizedString(str, delimiterPattern);
        List<String> tokens = tokenizedString.getTokens();

        if (tokens.size() == 0) {
            return StringUtils.EMPTY;
        }

        int start = 0;
        String firstApplied;
        do {
            firstApplied = abbrevMode.apply(tokens.get(start));
            start++;
        } while (firstApplied.isEmpty() && start < tokens.size());

        StringBuilder sb = new StringBuilder(firstApplied);

        if (separator == AcronymSeparator.KEEP_SPECIAL_CHARS) {
            Pattern specialCharPattern = Pattern.compile(separator.getValue());
            List<String> separators = tokenizedString.getSeparators();
            int nextSeparator = tokenizedString.isStartingWithSeparator() ? 1 : 0;

            for (int i = 1; i < tokens.size(); i++) {
                String chars = abbrevMode.apply(tokens.get(i));
                if (!chars.isEmpty()) {
                    sb.append(getSpecialChars(separators.get(nextSeparator), specialCharPattern)).append(
                            abbrevMode.apply(tokens.get(i)));
                }
                nextSeparator++;
            }
        } else {
            for (int i = start; i < tokens.size(); i++) {
                String chars = abbrevMode.apply(tokens.get(i));
                if (!chars.isEmpty()) {
                    sb.append(separator.getValue()).append(abbrevMode.apply(tokens.get(i)));
                }
            }

            if (sb.length() > 0 && AcronymSeparator.PERIOD == separator) {
                sb.append(separator.getValue());
            }
        }

        return sb.toString();
    }
