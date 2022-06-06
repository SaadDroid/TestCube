@Override
  public final int readInt() {
    checkReadable(4);
    int b1 = readUnsignedByte();
    int b2 = readUnsignedByte();
    int b3 = readUnsignedByte();
    int b4 = readUnsignedByte();
    return (b1 << 24) | (b2 << 16) | (b3 << 8) | b4;
  }
