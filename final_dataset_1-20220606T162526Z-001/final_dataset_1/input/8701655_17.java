public static int rightDistance(Rectangle inner, Rectangle outer) {
    assertOuterInner(outer, inner);
    return topRight(outer).x - topRight(inner).x;
  }
