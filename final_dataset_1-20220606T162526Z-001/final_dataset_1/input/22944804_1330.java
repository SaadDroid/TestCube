@Override
    public boolean hasInterestIn(char value, SearchContext context) {
        if (value == '?' || value == '#') {
            // Ignore illegal character unless it is the last character.
            return context.has(ContextKey.LAST_CHARACTER);
        }

        return true;
    }
