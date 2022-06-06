public void put(K key, V value) {
    _primaryMap.put(ArgumentChecker.notNull(key, "key"), ArgumentChecker.notNull(value, "value"));
    _secondaryMap.put(value, key);
  }
