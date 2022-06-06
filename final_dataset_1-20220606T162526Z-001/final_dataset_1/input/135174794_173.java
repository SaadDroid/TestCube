@Override
  public BigInteger getIntegerValue() {
    return new BigInteger(numericPart, base.getRadix());
  }
