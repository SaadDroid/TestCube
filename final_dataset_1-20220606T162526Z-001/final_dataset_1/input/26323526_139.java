@Override
  public DataSet<Embedding> evaluate() {
    return input
      .flatMap(new FilterAndProjectEdge<>(predicates, projectionPropertyKeys, isLoop))
      .name(getName());
  }
