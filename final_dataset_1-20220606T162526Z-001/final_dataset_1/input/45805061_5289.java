@Override
  public Object query(final ValueSpecification value) {
    ArgumentChecker.notNull(value, "value");
    final Pair<Integer, ValueSpecification> lookup = _valueMap.getUnderlyingAndSpecification(value);
    if (lookup == null) {
      return null;
    }
    return _snapshots.get(lookup.getFirst()).query(lookup.getSecond());
  }
