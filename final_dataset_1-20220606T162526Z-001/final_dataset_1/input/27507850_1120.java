@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Conjunction)) {
      return false;
    }
    Conjunction that = (Conjunction) o;
    return _conjuncts.equals(that._conjuncts);
  }
