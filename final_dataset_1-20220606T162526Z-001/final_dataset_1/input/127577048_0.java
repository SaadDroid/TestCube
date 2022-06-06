public static int mask(int crc) {
    // Rotate right by 15 bits and add a constant.
    return ((crc >>> 15) | (crc << 17)) + MASK_DELTA;
  }
