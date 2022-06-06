@Override
  public boolean evaluate(Embedding embedding, EmbeddingMetaData metaData) {
    for (CNFElement element : predicates) {
      if (!element.evaluate(embedding, metaData)) {
        return false;
      }
    }
    return true;
  }
