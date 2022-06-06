@Override
  public void join(Embedding left, Embedding right, Collector<Embedding> out) throws Exception {
    if (isValid(left, right)) {
      buildEmbedding(left, right);
      out.collect(reuseEmbedding);
    }
  }
