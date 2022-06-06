@Override
  public void addKeyValuePair(KeyValuePair pair) {
    Args.notNull(pair, "keyValuePair");
    if (getKeyValuePairs().contains(pair)) {
      getKeyValuePairs().remove(pair);
    }
    add(pair);
  }
