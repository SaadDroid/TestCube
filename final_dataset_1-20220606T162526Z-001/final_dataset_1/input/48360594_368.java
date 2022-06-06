@Override
    public String key(String str) {
        // use bigrams
        return this.key(str, 2);
    }
