@Override
  public DataSet<Embedding> execute() {
    FilterEmbeddings op =
      new FilterEmbeddings(getChildNode().execute(), filterPredicate, getEmbeddingMetaData());
    op.setName(toString());
    return op.evaluate();
  }
