@Override
  public String toString() {
    return MoreObjects.toStringHelper(Analysis.class)
        .add(PROP_NAME, _name)
        .add(PROP_QUESTIONS, _questions)
        .toString();
  }
