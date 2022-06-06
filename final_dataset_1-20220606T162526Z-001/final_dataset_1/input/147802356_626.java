public static int toUnsignedInt(final byte value) {
    final int intValue = value;
    if (intValue < 0) {
      return intValue + 256;
    } else {
      return intValue;
    }
  }
