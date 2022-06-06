@Override
    public String stem(String dbEntityName) {
        Matcher m = pattern.matcher(dbEntityName);
        return m.replaceAll("");
    }
