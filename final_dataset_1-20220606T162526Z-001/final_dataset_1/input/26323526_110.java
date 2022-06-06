@Override
  public DataSet<Embedding> evaluate() {
    DataSet<ExpandEmbedding> initialWorkingSet = preProcess();

    DataSet<ExpandEmbedding> iterationResults = iterate(initialWorkingSet);

    return postProcess(iterationResults);
  }
