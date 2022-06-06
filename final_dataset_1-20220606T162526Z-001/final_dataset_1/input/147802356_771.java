JacobianPoint add(JacobianPoint q) {

    FP2Immutable x1 = x;
    FP2Immutable y1 = y;
    FP2Immutable z1 = z;
    FP2Immutable x2 = q.x;
    FP2Immutable y2 = q.y;
    FP2Immutable z2 = q.z;

    boolean pInf = (z1.iszilch());
    boolean qInf = (z2.iszilch());
    if (pInf && qInf) {
      return INFINITY;
    } else if (qInf) {
      return new JacobianPoint(this);
    } else if (pInf) {
      return q;
    }

    FP2Immutable z1z1 = z1.sqr();
    FP2Immutable z2z2 = z2.sqr();
    FP2Immutable u1 = x1.mul(z2z2);
    FP2Immutable u2 = x2.mul(z1z1);
    FP2Immutable s1 = y1.mul(z2).mul(z2z2);
    FP2Immutable s2 = y2.mul(z1).mul(z1z1);

    // Shortcut for equal X coordinates case. Either P == Q or P == -Q.
    if (u1.equals(u2)) {
      return s1.equals(s2) ? dbl() : INFINITY;
    }

    FP2Immutable h = u2.sub(u1);
    FP2Immutable i = h.dbl().sqr();
    FP2Immutable j = h.mul(i);
    FP2Immutable rr = s2.sub(s1).dbl();
    FP2Immutable v = u1.mul(i);
    FP2Immutable x3 = rr.sqr().sub(j).sub(v.dbl());
    FP2Immutable y3 = rr.mul(v.sub(x3)).sub(s1.mul(j).dbl());
    FP2Immutable z3 = z1.mul(z2).mul(h).dbl();

    return new JacobianPoint(x3, y3, z3);
  }
