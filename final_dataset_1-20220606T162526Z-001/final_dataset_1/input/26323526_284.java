public Vector mSub(Vector other) {
    x -= other.x;
    y -= other.y;
    check();
    return this;
  }
