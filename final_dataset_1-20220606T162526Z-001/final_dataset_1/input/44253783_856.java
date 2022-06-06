@Override
  public String createQualifier() {
    String qualifier = getProducer().createQualifier();
    return isEmpty(qualifier) ? super.createQualifier() : qualifier;
  }
