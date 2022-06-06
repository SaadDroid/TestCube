@VisibleForTesting
  static boolean isOnCurve(JacobianPoint p) {
    if (p.isInfinity()) {
      return true;
    }

    FP2Immutable x = p.getX();
    FP2Immutable y = p.getY();
    FP2Immutable z = p.getZ();

    FP2Immutable y2 = y.sqr();
    FP2Immutable x3 = x.pow(3);
    FP2Immutable z6 = z.pow(6);

    FP2Immutable four = new FP2Immutable(new FP(4), new FP(4));
    return y2.equals(x3.add(z6.mul(four)));
  }
