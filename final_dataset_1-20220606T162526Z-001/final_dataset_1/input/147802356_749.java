public static G1Point fromBytesCompressed(Bytes bytes) {
    checkArgument(
        bytes.size() == fpPointSize,
        "Expected %s bytes but received %s.",
        fpPointSize,
        bytes.size());
    byte[] xBytes = bytes.toArray();

    boolean aIn = (xBytes[0] & (byte) (1 << 5)) != 0;
    boolean bIn = (xBytes[0] & (byte) (1 << 6)) != 0;
    boolean cIn = (xBytes[0] & (byte) (1 << 7)) != 0;
    xBytes[0] &= (byte) 31;

    if (!cIn) {
      throw new IllegalArgumentException("The serialized input does not have the C flag set.");
    }

    if (bIn) {
      if (!aIn && Bytes.wrap(xBytes).isZero()) {
        // This is a correctly formed serialization of infinity
        return new G1Point();
      } else {
        // The input is malformed
        throw new IllegalArgumentException(
            "The serialized input has B flag set, but A flag is set, or X is non-zero.");
      }
    }

    // We must check that x < q (the curve modulus) for this serialization to be valid
    // We raise an exception (that should be caught) if this check fails: somebody might feed us
    // faulty input.
    BIG xBig = BIG.fromBytes(xBytes);
    BIG modulus = new BIG(ROM.Modulus);
    if (BIG.comp(modulus, xBig) <= 0) {
      throw new IllegalArgumentException("X coordinate is too large.");
    }

    ECP point = new ECP(xBig);

    if (point.is_infinity()) {
      throw new IllegalArgumentException("X coordinate is not on the curve.");
    }

    if (!isInGroup(point)) {
      throw new IllegalArgumentException("The deserialized point is not in the G1 subgroup.");
    }

    // Did we get the right branch of the sqrt?
    if (aIn != Util.calculateYFlag(point.getY())) {
      // We didn't: so choose the other branch of the sqrt.
      FP x = new FP(point.getX());
      FP yneg = new FP(point.getY());
      yneg.neg();
      point = new ECP(x.redc(), yneg.redc());
    }

    return new G1Point(point);
  }
