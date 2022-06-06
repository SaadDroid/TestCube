@Override
  public Double[] getRoots(final RealPolynomialFunction1D function) {
    ArgumentChecker.notNull(function, "function");
    try {
      final Complex[] roots = ROOT_FINDER.solveAll(function.getCoefficients(), 0);
      final List<Double> realRoots = new ArrayList<>();
      for (final Complex c : roots) {
        if (CompareUtils.closeEquals(c.getImaginary(), 0, EPS)) {
          realRoots.add(c.getReal());
        }
      }
      if (realRoots.isEmpty()) {
        throw new MathException("Could not find any real roots");
      }
      return realRoots.toArray(EMPTY_ARRAY);
    } catch (final FunctionEvaluationException e) {
      throw new MathException(e);
    } catch (final org.apache.commons.math.ConvergenceException e) {
      throw new MathException(e);
    }
  }
