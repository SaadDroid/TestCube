@Override
    public V apply(final K key) {
        if (dictionary == null) {
            throw new IllegalArgumentException("The " + DictionaryLookup.class.getName() + " KorypheFunction has not been provided with a dictionary");
        }
        return dictionary.get(key);
    }
