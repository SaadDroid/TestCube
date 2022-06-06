public void doFit(final double[] paramsGuess, final double[] dataStrikes, final double[] dataVolatilities, final double timeToExpiry, final double forwardX, final double forwardY,
      final int nNormals,
      final int nDataX, final double paramsGuessCorrection) {

    ArgumentChecker.notNull(paramsGuess, "paramsGuess");
    ArgumentChecker.notNull(dataStrikes, "dataStrikes");
    ArgumentChecker.notNull(dataVolatilities, "dataVolatilities");

    final int nParams = paramsGuess.length;
    final int nData = dataStrikes.length;

    ArgumentChecker.isTrue(nDataX < nData, "(dataX length) < (dataX length + dataY length)");
    ArgumentChecker.isTrue(dataStrikes.length == dataVolatilities.length, "dataStrikes not the same length as dataVols");
    ArgumentChecker.isTrue(nParams == 5 * nNormals - 3, "5 * N -3 free parameters");

    for (int i = 0; i < nData; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(dataStrikes[i]), "dataStrikes containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(dataStrikes[i]), "dataStrikes containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(dataVolatilities[i]), "dataVolatilities containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(dataVolatilities[i]), "dataVolatilities containing Infinity");
    }
    for (int i = 0; i < nParams; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(paramsGuess[i]), "paramsGuess containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(paramsGuess[i]), "paramsGuess containing Infinity");
    }
    ArgumentChecker.isFalse(Double.isNaN(timeToExpiry), "timeToExpiry containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(timeToExpiry), "timeToExpiry containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(forwardX), "forwardX containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(forwardX), "forwardX containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(forwardY), "forwardY containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(forwardY), "forwardY containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(paramsGuessCorrection), "paramsGuessCorrection containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(paramsGuessCorrection), "paramsGuessCorrection containing Infinity");

    ArgumentChecker.isTrue(timeToExpiry > 0, "timeToExpiry should be positive");
    ArgumentChecker.isTrue(forwardX > 0, "forwardX should be positive");
    ArgumentChecker.isTrue(forwardY > 0, "forwardY should be positive");
    ArgumentChecker.isTrue(paramsGuessCorrection > 0, "paramsGuessCorrection should be positive");

    double[] dataStrs = new double[nData];
    double[] dataVols = new double[nData];
    double[] dataDerivedYDiff = new double[nData];

    double[][] gradM = new double[nData][nParams];
    final double[] gradFunctionValueM = new double[nParams];
    final double[][] hessian = new double[nParams][nParams];
    _paramsGuess = new double[nParams];

    _paramsGuess = paramsGuess;
    final double time = timeToExpiry;
    final double fwdX = forwardX;
    final double fwdY = forwardY;
    final int nNorms = nNormals;
    final int nX = nDataX;
    final double pGuessCrrt = paramsGuessCorrection;

    dataStrs = Arrays.copyOf(dataStrikes, nData);
    dataVols = Arrays.copyOf(dataVolatilities, nData);

    Arrays.fill(gradFunctionValueM, 0.);
    for (int i = 0; i < nParams; ++i) {
      Arrays.fill(hessian[i], 0.);
    }

    int k = 0;
    double rho = 0.;
    _shift = 0.;
    double shiftModFac = 2.;
    boolean done = false;
    double[] paramsJump = new double[nParams];

    gradM = exactFunctionDerivative(_paramsGuess, dataStrs, time, fwdX, fwdY, nNorms, nX);
    dataDerivedYDiff = exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX);

    for (int i = 0; i < nParams; ++i) {
      for (int j = 0; j < nData; ++j) {
        gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
      }
    }

    for (int i = 0; i < nParams; ++i) {
      for (int j = 0; j < nParams; ++j) {
        for (int l = 0; l < nData; ++l) {
          hessian[i][j] += gradM[l][i] * gradM[l][j];
        }
      }
    }

    for (int i = 0; i < nParams; ++i) {
      if (hessian[i][i] > _shift) {
        _shift = hessian[i][i];
      }
    }
    _shift = TAU * _shift;

    _iniSqu = 0.5 * getVecNormSq(exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX));

    if (getVecNorm(gradFunctionValueM) <= EPS_1) {
      done = true;
      final double[] tmp = exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX);
      _finalSqu = 0.5 * getVecNormSq(tmp);
    }

    while (done == false && k < ITRMAX) {

      k = k + 1;

      ///confirming positive parameters and NotNaN
      boolean confPositiveParams = false;
      while (confPositiveParams == false) {

        paramsJump = theMatrixEqnSolver(dataStrs, dataVols, gradFunctionValueM, hessian, time, fwdX, fwdY, nNorms, nX);

        int nWarnings = 0;
        for (int i = 0; i < nParams; ++i) {
          final double tmpGuess = _paramsGuess[i] + paramsJump[i];
          if (tmpGuess <= 0. || Double.isNaN(paramsJump[i])) {
            ++nWarnings;
          }
        }
        if (nWarnings == 0) {

          confPositiveParams = true;
        } else {

          Arrays.fill(gradFunctionValueM, 0.);
          for (int i = 0; i < nParams; ++i) {
            Arrays.fill(hessian[i], 0.);
          }

          for (int i = 0; i < nParams; ++i) {
            _paramsGuess[i] = pGuessCrrt * (1e-2 + _randObj.nextDouble());
          }

          gradM = exactFunctionDerivative(_paramsGuess, dataStrs, time, fwdX, fwdY, nNorms, nX);
          dataDerivedYDiff = exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX);

          for (int i = 0; i < nParams; ++i) {
            for (int j = 0; j < nData; ++j) {
              gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
            }
          }

          for (int i = 0; i < nParams; ++i) {
            for (int j = 0; j < nParams; ++j) {
              for (int l = 0; l < nData; ++l) {
                hessian[i][j] += gradM[l][i] * gradM[l][j];
              }
            }
          }
          _shift = 0.;
          for (int i = 0; i < nParams; ++i) {
            if (hessian[i][i] > _shift) {
              _shift = hessian[i][i];
            }
          }
          _shift = TAU * _shift;

        }
      }
      ///

      if (getVecNorm(paramsJump) <= EPS_2 * (getVecNorm(_paramsGuess) + EPS_2)) {

        done = true;
        _paramsGuess = addVectors(_paramsGuess, paramsJump);
        _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX));

      } else {

        rho = getGainRatio(paramsJump, dataStrs, dataVols, gradFunctionValueM, time, fwdX, fwdY, nNorms, nX);
        _paramsGuess = addVectors(_paramsGuess, paramsJump);

        if (rho > 0.) {

          Arrays.fill(gradFunctionValueM, 0.);
          for (int i = 0; i < nParams; ++i) {
            Arrays.fill(hessian[i], 0.);
          }

          gradM = exactFunctionDerivative(_paramsGuess, dataStrs, time, fwdX, fwdY, nNorms, nX);
          dataDerivedYDiff = exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX);

          for (int i = 0; i < nParams; ++i) {
            for (int j = 0; j < nData; ++j) {
              gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
            }
          }

          for (int i = 0; i < nParams; ++i) {
            for (int j = 0; j < nParams; ++j) {
              for (int l = 0; l < nData; ++l) {
                hessian[i][j] += gradM[l][i] * gradM[l][j];
              }
            }
          }

          if (getVecNorm(gradFunctionValueM) <= EPS_1) {
            _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX));
            done = true;
          }

          _shift = _shift * Math.max(1. / 3., 1. - (2. * rho - 1.) * (2. * rho - 1.) * (2. * rho - 1.));
          shiftModFac = 2.;

        } else {

          _shift = _shift * shiftModFac;
          shiftModFac = 2. * shiftModFac;

        }

      }

      if (k == ITRMAX) {
        s_logger.error("Too Many Iterations");
        _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_paramsGuess, dataStrs, dataVols, time, fwdX, fwdY, nNorms, nX));
      }
    }

  }
