public UInt64 mod(final long divisor) {
    checkPositive(divisor);
    return mod(value, divisor);
  }
