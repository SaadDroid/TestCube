@Deprecated
  public String getDiscountingCurveName() {
    if (_discountingCurveName == null) {
      throw new IllegalStateException("Discounting curve name was not set");
    }
    return _discountingCurveName;
  }
