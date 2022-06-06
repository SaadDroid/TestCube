public static byte toByteExactUnsigned(final int value) throws IllegalArgumentException {
    checkArgument(value >= 0, "Supplied int value (%s) is negative", value);
    return castToByteExact(value);
  }
