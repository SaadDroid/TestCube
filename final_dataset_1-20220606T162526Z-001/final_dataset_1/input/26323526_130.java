@Override
  public DataSet<Embedding> evaluate() {
    return input
      .flatMap(new FilterAndProjectVertex<>(predicates, projectionPropertyKeys))
      .name(getName());
  }
