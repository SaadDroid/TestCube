public List<String> build() {
        List<String> rights = new ArrayList<String>();
        for (String token : provider.getTokens()) {
            rights.add(generator.getHash(token.concat(String.valueOf(session.getId()))));
        }
        return rights;
    }
