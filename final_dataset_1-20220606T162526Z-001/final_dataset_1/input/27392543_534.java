public Dag<T> concatenate(Dag<T> other) {
    return concatenate(other, new HashSet<>());
  }
