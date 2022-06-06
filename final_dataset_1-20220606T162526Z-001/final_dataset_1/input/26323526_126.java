@Override
  public DataSet<Embedding> evaluate() {
    return input.flatMap(
      new FilterAndProjectTriple(
        sourceVariable,
        edgeVariable,
        targetVariable,
        predicates,
        projectionPropertyKeys,
        vertexMatchStrategy
      )
    ).name(getName());
  }
