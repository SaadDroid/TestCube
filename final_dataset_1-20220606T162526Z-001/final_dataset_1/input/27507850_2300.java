@Nullable
  private BDD toBDD(Collection<Integer> ints, BDDInteger var) {
    if (ints == null || ints.isEmpty()) {
      return null;
    }
    return _bddOps.or(ints.stream().map(var::value).collect(Collectors.toList()));
  }
