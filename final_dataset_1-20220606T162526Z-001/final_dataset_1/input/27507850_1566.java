@Override
  public Long visitLiteralLong(LiteralLong literalLong, Void arg) {
    return literalLong.getValue();
  }
