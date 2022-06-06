@Override
  public Double getZValue(final Double x, final Double y) {
    Validate.notNull(x, "x");
    Validate.notNull(y, "y");
    final double[] xArray = getXDataAsPrimitive();
    final double[] yArray = getYDataAsPrimitive();
    final int n = size();
    for (int i = 0; i < n; i++) {
      if (Double.doubleToLongBits(xArray[i]) == Double.doubleToLongBits(x)) {
        if (Double.doubleToLongBits(yArray[i]) == Double.doubleToLongBits(y)) {
          return getZDataAsPrimitive()[i];
        }
      }
    }
    throw new IllegalArgumentException("No x-y data in surface for (" + x + ", " + y + ")");
  }
