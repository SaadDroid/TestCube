@Override
  public Set<CommunityVar> visitBufferedStatement(
      BufferedStatement bufferedStatement, Configuration arg) {
    return bufferedStatement.getStatement().accept(this, arg);
  }
