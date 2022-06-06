JacobianPoint dbl() {
    FP2Immutable a = x.sqr();
    FP2Immutable b = y.sqr();
    FP2Immutable c = b.sqr();
    FP2Immutable d = x.add(b).sqr().sub(a).sub(c).dbl();
    FP2Immutable e = a.mul(3);
    FP2Immutable f = e.sqr();

    FP2Immutable xOut = f.sub(d.dbl());
    FP2Immutable yOut = e.mul(d.sub(xOut)).sub(c.mul(8));
    FP2Immutable zOut = y.mul(z).dbl();

    return zOut.iszilch() ? INFINITY : new JacobianPoint(xOut, yOut, zOut);
  }
