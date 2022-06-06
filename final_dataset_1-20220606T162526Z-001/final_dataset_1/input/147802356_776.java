@Override
  // Consider two Jacobian points to be equal iff their affine representations are equal.
  public boolean equals(Object obj) {
    if (Objects.isNull(obj)) {
      return false;
    }
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof JacobianPoint)) {
      return false;
    }
    JacobianPoint other = (JacobianPoint) obj;
    JacobianPoint p1 = this.toAffine();
    JacobianPoint p2 = other.toAffine();
    return (p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY()));
  }
