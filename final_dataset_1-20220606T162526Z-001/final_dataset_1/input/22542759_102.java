@Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (!(o instanceof ImmutablePair)) {
      return false;
    }
    ImmutablePair<?, ?> other = (ImmutablePair<?, ?>) o;
    return Objects.equal(first, other.first) && Objects.equal(second, other.second);
  }
