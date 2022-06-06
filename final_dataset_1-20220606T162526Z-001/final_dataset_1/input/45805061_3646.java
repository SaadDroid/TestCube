public Function1D<StandardDiscountBondModelDataBundle, RecombiningBinomialTree<Triple<Double, Double, Double>>> getTrees(final ZonedDateTime time) {
    Validate.notNull(time, "time");
    return new Function1D<StandardDiscountBondModelDataBundle, RecombiningBinomialTree<Triple<Double, Double, Double>>>() {

      @SuppressWarnings({"unchecked", "synthetic-access" })
      @Override
      public RecombiningBinomialTree<Triple<Double, Double, Double>> evaluate(final StandardDiscountBondModelDataBundle data) {
        Validate.notNull(data, "data");
        final double[][] r = new double[_n + 1][_j];
        final double[][] q = new double[_n + 1][_j];
        final double[][] d = new double[_n + 1][_j];
        final double[] u = new double[_n + 1];
        final double[] p = new double[_n + 2];
        final double t = DateUtils.getDifferenceInYears(data.getDate(), time);
        final double dt = t / _n;
        final double dtSqrt = Math.sqrt(dt);
        final double r1 = data.getShortRate(dt);
        final double sigma = data.getShortRateVolatility(dt);
        p[0] = 1.0;
        for (int i = 1; i <= _n + 1; i++) {
          p[i] = 1. / Math.pow((1 + data.getShortRate(i) * dt), dt * i);
        }
        q[0][0] = 1.;
        u[0] = r1;
        r[0][0] = r1;
        d[0][0] = 1. / (1 + r1 * dt);
        for (int i = 1; i <= _n; i++) {
          q[i][0] = 0.5 * q[i - 1][0] * d[i - 1][0];
          q[i][i] = 0.5 * q[i - 1][i - 1] * d[i - 1][i - 1];
          for (int j = -i + 2, k = 1; j <= i - 2; j += 2, k++) {
            q[i][k] = 0.5 * (q[i - 1][k - 1] * d[i - 1][k - 1] + q[i - 1][k] * d[i - 1][k]);
          }
          u[i] = _rootFinder.getRoot(getMedian(sigma, i, dt, q, p[i + 1]), 0., 1.);
          for (int j = -i, k = 0; j <= i; j += 2, k++) {
            r[i][k] = u[i] * Math.exp(sigma * j * dtSqrt);
            d[i][k] = 1. / (1 + r[i][k] * dt);
          }
        }
        final Triple<Double, Double, Double>[][] result = new Triple[_n + 1][_j];
        for (int i = 0; i <= _n; i++) {
          for (int j = 0; j < _j; j++) {
            result[i][j] = new Triple<>(r[i][j], d[i][j], q[i][j]);
          }
        }
        return new RecombiningBinomialTree<>(result);
      }

    };
  }
