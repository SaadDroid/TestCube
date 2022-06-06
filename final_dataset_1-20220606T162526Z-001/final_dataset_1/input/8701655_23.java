public static Rectangle extendDown(Rectangle r, int distance) {
    return r.changeDimension(r.dimension.add(new Vector(0, distance)));
  }
