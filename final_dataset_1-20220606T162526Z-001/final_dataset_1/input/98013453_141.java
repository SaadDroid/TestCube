@Override
    public boolean isValidName(String typeName) {
        Matcher m = TRAIT_NAME_PATTERN.matcher(typeName);

        return m.matches();
    }
