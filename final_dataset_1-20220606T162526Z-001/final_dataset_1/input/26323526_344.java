@Override
  public boolean filter(EL element) throws Exception {
    return labels.contains(element.getLabel());
  }
