public HashMap<String, DoubleMatrix2D> calculateCrossGammaIntraCurve(final InstrumentDerivative instrument, final MulticurveProviderDiscount multicurve) {
    ArgumentChecker.notNull(instrument, "instrument");
    ArgumentChecker.notNull(multicurve, "multi-curve provider");
    Set<String> names = multicurve.getAllNames();
    int nbCurve = names.size();
    String[] namesArray = names.toArray(new String[nbCurve]);
    Currency ccy = checkUniqueCurrency(multicurve);
    InterpolatedDoublesCurve[] interpolatedCurves = interpolatedCurves(multicurve, nbCurve, namesArray);
    // Curves description
    double[][] y = new double[nbCurve][];
    double[][] x = new double[nbCurve][];
    int[] nbNode = new int[nbCurve];
    for (int loopcurve = 0; loopcurve < nbCurve; loopcurve++) {
      y[loopcurve] = interpolatedCurves[loopcurve].getYDataAsPrimitive();
      x[loopcurve] = interpolatedCurves[loopcurve].getXDataAsPrimitive();
      nbNode[loopcurve] = x[loopcurve].length;
    }
    // Initial sensitivity
    MultipleCurrencyParameterSensitivity ps0 = _psc.calculateSensitivity(instrument, multicurve);
    double[][] ps0Array = sensitivitiesAsArrayOfMatrix(nbCurve, namesArray, ccy, nbNode, ps0);
    // Bump and recompute for each curve and each point
    HashMap<String, DoubleMatrix2D> result = new HashMap<>();
    for (int loopcurve = 0; loopcurve < nbCurve; loopcurve++) {
      MultipleCurrencyParameterSensitivity[] psShift = new MultipleCurrencyParameterSensitivity[nbNode[loopcurve]];
      double[][] gammaArray = new double[nbNode[loopcurve]][nbNode[loopcurve]];
      for (int loopnode = 0; loopnode < nbNode[loopcurve]; loopnode++) {
        final double[] yieldBumped = y[loopcurve].clone();
        yieldBumped[loopnode] += _shift;
        MulticurveProviderDiscount multicurveBumped = bumpedProvider(multicurve, namesArray[loopcurve],
            interpolatedCurves[loopcurve].getInterpolator(), x[loopcurve], yieldBumped);
        psShift[loopnode] = _psc.calculateSensitivity(instrument, multicurveBumped);
        DoubleMatrix1D sensiCurve = psShift[loopnode].getSensitivity(namesArray[loopcurve], ccy);
        double[] psShiftArray;
        if (sensiCurve != null) {
          psShiftArray = sensiCurve.getData();
        } else {
          psShiftArray = new double[nbNode[loopcurve]];
        }
        for (int loopnode2 = 0; loopnode2 < nbNode[loopcurve]; loopnode2++) {
          gammaArray[loopnode][loopnode2] = (psShiftArray[loopnode2] - ps0Array[loopcurve][loopnode2]) / _shift;
        }
      }
      DoubleMatrix2D gammaMat = new DoubleMatrix2D(gammaArray);
      result.put(namesArray[loopcurve], gammaMat);
    }
    return result;
  }
