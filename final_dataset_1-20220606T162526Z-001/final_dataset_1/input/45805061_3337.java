public void doFit(final double[] rhosGuess, final double[] dataStrikes, final double[] dataVolatilities, final double timeToExpiry, final double[] weights, final double[] sigmasX,
      final double[] sigmasY,
      final double[] relativePartialForwardsX, final double[] relativePartialForwardsY, final double forwardX, final double forwardY) {

    ArgumentChecker.notNull(rhosGuess, "rhosGuess");
    ArgumentChecker.notNull(dataStrikes, "dataStrikes");
    ArgumentChecker.notNull(dataVolatilities, "dataVolatilities");
    ArgumentChecker.notNull(weights, "weights");
    ArgumentChecker.notNull(sigmasX, "sigmasX");
    ArgumentChecker.notNull(sigmasY, "sigmasY");
    ArgumentChecker.notNull(relativePartialForwardsX, "relativePartialForwardsX");
    ArgumentChecker.notNull(relativePartialForwardsY, "relativePartialForwardsY");

    final int nNormals = rhosGuess.length;
    final int nData = dataStrikes.length;

    ArgumentChecker.isTrue(dataStrikes.length == dataVolatilities.length, "dataStrikes not the same length as dataVols");
    ArgumentChecker.isTrue(weights.length == sigmasX.length, "weights not the same length as sigmasX");
    ArgumentChecker.isTrue(weights.length == sigmasY.length, "weights not the same length as sigmasY");
    ArgumentChecker.isTrue(weights.length == relativePartialForwardsX.length, "weights not the same length as relativePartialForwardsX");
    ArgumentChecker.isTrue(weights.length == relativePartialForwardsY.length, "weights not the same length as relativePartialForwardsY");

    for (int i = 0; i < nData; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(dataStrikes[i]), "dataStrikes containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(dataStrikes[i]), "dataStrikes containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(dataVolatilities[i]), "dataVolatilities containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(dataVolatilities[i]), "dataVolatilities containing Infinity");
    }
    for (int i = 0; i < nNormals; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(rhosGuess[i]), "rhosGuess containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(rhosGuess[i]), "rhosGuess containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(weights[i]), "weights containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(weights[i]), "weights containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(sigmasX[i]), "sigmasX containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(sigmasX[i]), "sigmasX containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(sigmasY[i]), "sigmasY containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(sigmasY[i]), "sigmasY containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(relativePartialForwardsX[i]), "relativePartialForwardsX containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(relativePartialForwardsX[i]), "relativePartialForwardsX containing Infinity");
      ArgumentChecker.isFalse(Double.isNaN(relativePartialForwardsY[i]), "relativePartialForwardsY containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(relativePartialForwardsY[i]), "relativePartialForwardsY containing Infinity");
    }
    ArgumentChecker.isFalse(Double.isNaN(timeToExpiry), "timeToExpiry containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(timeToExpiry), "timeToExpiry containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(forwardX), "forwardX containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(forwardX), "forwardX containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(forwardY), "forwardY containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(forwardY), "forwardY containing Infinity");

    ArgumentChecker.isTrue(timeToExpiry > 0, "timeToExpiry should be positive");
    ArgumentChecker.isTrue(forwardX > 0, "forwardX should be positive");
    ArgumentChecker.isTrue(forwardY > 0, "forwardY should be positive");

    double[] dataDerivedYDiff = new double[nData];
    double[][] gradM = new double[nData][nNormals];
    final double[] gradFunctionValueM = new double[nNormals];
    final double[][] hessian = new double[nNormals][nNormals];

    final double forwardZ = forwardX / forwardY;

    final double[] dataStrs = dataStrikes;
    final double[] dataVols = dataVolatilities;

    final double time = timeToExpiry;

    final double[] wghts = weights;
    final double[] sigsX = sigmasX;
    final double[] sigsY = sigmasY;
    final double[] rpfsX = relativePartialForwardsX;
    final double[] rpfsY = relativePartialForwardsY;
    _rhosGuess = rhosGuess;

    Arrays.fill(gradFunctionValueM, 0.);
    for (int i = 0; i < nNormals; ++i) {
      Arrays.fill(hessian[i], 0.);
    }

    int k = 0;
    double rho = 0.;
    _shift = 0;
    double shiftModFac = 2.;
    boolean done = false;
    double[] rhosJump = new double[nNormals];

    gradM = exactFunctionDerivative(_rhosGuess, dataStrs, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);
    dataDerivedYDiff = exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);

    for (int i = 0; i < nNormals; ++i) {
      for (int j = 0; j < nData; ++j) {
        gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
      }
    }

    for (int i = 0; i < nNormals; ++i) {
      for (int j = 0; j < nNormals; ++j) {
        for (int l = 0; l < nData; ++l) {
          hessian[i][j] += gradM[l][i] * gradM[l][j];
        }
      }
    }

    for (int i = 0; i < nNormals; ++i) {
      if (hessian[i][i] > _shift) {
        _shift = hessian[i][i];
      }
    }
    _shift = TAU * _shift;

    _iniSqu = 0.5 * getVecNormSq(exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ));

    if (getVecNorm(gradFunctionValueM) <= EPS_1) {
      done = true;
      final double[] tmp = exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);
      _finalSqu = 0.5 * getVecNormSq(tmp);
    }

    while (done == false && k < ITRMAX) {

      k = k + 1;

      ///confirming -1<= rhos <=1 and NotNaN
      boolean confRhos = false;
      while (confRhos == false) {

        rhosJump = theMatrixEqnSolver(dataStrs, dataVols, gradFunctionValueM, hessian, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);

        int nOutOfRange = 0;
        for (int i = 0; i < nNormals; ++i) {
          final double tmpGuess = _rhosGuess[i] + rhosJump[i];
          if (tmpGuess < -1. || tmpGuess > 1. || Double.isNaN(tmpGuess)) {
            ++nOutOfRange;
          }
        }
        if (nOutOfRange == 0) {
          confRhos = true;
        } else {

          for (int i = 0; i < nNormals; ++i) {
            _rhosGuess[i] = _randObj.nextDouble();
          }

          gradM = exactFunctionDerivative(_rhosGuess, dataStrs, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);
          dataDerivedYDiff = exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);

          for (int i = 0; i < nNormals; ++i) {
            for (int j = 0; j < nData; ++j) {
              gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
            }
          }

          for (int i = 0; i < nNormals; ++i) {
            for (int j = 0; j < nNormals; ++j) {
              for (int l = 0; l < nData; ++l) {
                hessian[i][j] += gradM[l][i] * gradM[l][j];
              }
            }
          }

          _shift = 0.;
          for (int i = 0; i < nNormals; ++i) {
            if (hessian[i][i] > _shift) {
              _shift = hessian[i][i];
            }
          }
          _shift = TAU * _shift;
        }

      }
      ///

      if (getVecNorm(rhosJump) <= EPS_2 * (getVecNorm(_rhosGuess) + EPS_2)) {

        done = true;
        _rhosGuess = addVectors(_rhosGuess, rhosJump);
        _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ));

      } else {

        rho = getGainRatio(rhosJump, dataStrs, dataVols, gradFunctionValueM, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);
        _rhosGuess = addVectors(_rhosGuess, rhosJump);

        if (rho > 0.) {

          Arrays.fill(gradFunctionValueM, 0.);
          for (int i = 0; i < nNormals; ++i) {
            Arrays.fill(hessian[i], 0.);
          }

          gradM = exactFunctionDerivative(_rhosGuess, dataStrs, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);
          dataDerivedYDiff = exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ);

          for (int i = 0; i < nNormals; ++i) {
            for (int j = 0; j < nData; ++j) {
              gradFunctionValueM[i] += -gradM[j][i] * dataDerivedYDiff[j];
            }
          }

          for (int i = 0; i < nNormals; ++i) {
            for (int j = 0; j < nNormals; ++j) {
              for (int l = 0; l < nData; ++l) {
                hessian[i][j] += gradM[l][i] * gradM[l][j];
              }
            }
          }

          if (getVecNorm(gradFunctionValueM) <= EPS_1) {
            _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ));
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
        s_logger.error("Too many iterations");
        _finalSqu = 0.5 * getVecNormSq(exactFunctionValue(_rhosGuess, dataStrs, dataVols, time, wghts, sigsX, sigsY, rpfsX, rpfsY, forwardZ));
      }
    }

  }
