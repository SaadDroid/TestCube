@Override
  public T decode(PositionedByteRange src) {
    if (src.getRemaining() < length) {
      throw new IllegalArgumentException("Not enough buffer remaining. src.offset: "
          + src.getOffset() + " src.length: " + src.getLength() + " src.position: "
          + src.getPosition() + " max length: " + length);
    }
    // create a copy range limited to length bytes. boo.
    PositionedByteRange b = new SimplePositionedByteRange(length);
    src.get(b.getBytes());
    return base.decode(b);
  }
