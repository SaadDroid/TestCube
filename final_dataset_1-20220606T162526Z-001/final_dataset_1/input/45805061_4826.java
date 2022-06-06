public double[] getCurveNodePointsForCurve(final String name) {
    ArgumentChecker.notNull(name, "name");
    final double[] result = _unknownCurveNodePoints.get(name);
    if (result == null) {
      throw new IllegalArgumentException("Data for name " + name + " not found");
    }
    return result;
  }
