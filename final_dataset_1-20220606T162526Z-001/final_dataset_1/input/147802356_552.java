public static Bitvector fromBytes(Bytes bytes, int size) {
    checkArgument(
        bytes.size() == sszSerializationLength(size),
        "Incorrect data size (%s) for Bitvector of size %s",
        bytes.size(),
        size);
    BitSet bitset = new BitSet(size);

    for (int i = size - 1; i >= 0; i--) {
      if (((bytes.get(i / 8) >>> (i % 8)) & 0x01) == 1) {
        bitset.set(i);
      }
    }

    return new Bitvector(bitset, size);
  }
