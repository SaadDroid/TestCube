@Override
  public int encode(PositionedByteRange dst, T val) {
    if (dst.getRemaining() < length) {
      throw new IllegalArgumentException("Not enough buffer remaining. dst.offset: "
          + dst.getOffset() + " dst.length: " + dst.getLength() + " dst.position: "
          + dst.getPosition() + " max length: " + length);
    }
    int written = base.encode(dst, val);
    if (written > length) {
      throw new IllegalArgumentException("Length of encoded value (" + written
          + ") exceeds max length (" + length + ").");
    }
    // TODO: is the zero-padding appropriate?
    for (; written < length; written++) { dst.put((byte) 0x00); }
    return written;
  }
