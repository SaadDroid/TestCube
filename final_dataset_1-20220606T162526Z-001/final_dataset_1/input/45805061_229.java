@Override
  public String classifyPosition(final Position position) {
    String positionAttribute = position.getAttributes().get(getAttribute());
    if (positionAttribute != null) {
      return positionAttribute;
    }
    for (Trade trade : position.getTrades()) {
      final String value = trade.getAttributes().get(getAttribute());
      if (value != null) {
        return value;
      }
    }
    return getUnknownClassification();
  }
