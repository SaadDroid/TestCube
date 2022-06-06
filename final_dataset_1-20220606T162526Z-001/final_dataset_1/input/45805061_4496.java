public LocalDateDoubleTimeSeries getSeries(final double[] phi, final int p, final double[] theta, final int q, final LocalDate[] dates) {
    if (phi == null && p != 0) {
      throw new IllegalArgumentException("AR coefficient array was null");
    }
    if (p < 0) {
      throw new IllegalArgumentException("p must be positive");
    }
    if (phi != null && phi.length < p + 1) {
      throw new IllegalArgumentException("AR coefficient array must contain at least " + (p + 1) + " elements");
    }
    if (theta == null && q != 0) {
      throw new IllegalArgumentException("MA coefficient array was null");
    }
    if (q < 0) {
      throw new IllegalArgumentException("q must be positive");
    }
    if (theta != null && theta.length < q) {
      throw new IllegalArgumentException("MA coefficient array must contain at least " + q + " elements");
    }
    Validate.notNull(dates, "dates");
    ArgumentChecker.notEmpty(dates, "dates");
    if (theta != null) {
      final double[] theta1 = new double[theta.length + 1];
      theta1[0] = 0.;
      for (int i = 0; i < theta.length; i++) {
        theta1[i + 1] = theta[i];
      }
      if (p == 0) {
        return _maModel.getSeries(theta1, q, dates);
      }
      if (q == 0) {
        return _arModel.getSeries(phi, p, dates);
      }
      return _arModel.getSeries(phi, p, dates).add(_maModel.getSeries(theta1, q, dates));
    }
    return _arModel.getSeries(phi, p, dates);
  }
