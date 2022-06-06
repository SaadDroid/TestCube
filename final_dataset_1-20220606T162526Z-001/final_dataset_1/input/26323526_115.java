@Override
  public void flatMap(ExpandEmbedding value, Collector<Embedding> out) throws Exception {
    if (value.pathSize() < minPathLength) {
      return;
    }

    if (closingColumn >= 0 && !value.getBase().getId(closingColumn).equals(value.getEnd())) {
      return;
    }

    out.collect(value.toEmbedding());
  }
