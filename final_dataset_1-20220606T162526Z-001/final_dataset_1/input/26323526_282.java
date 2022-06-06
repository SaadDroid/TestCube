@Override
  public boolean equals(Object other) {
    if (other != null && other instanceof Vector) {
      Vector otherv = (Vector) other;
      return this.distance(otherv) < 0.000000001;
    }
    return false;
  }
