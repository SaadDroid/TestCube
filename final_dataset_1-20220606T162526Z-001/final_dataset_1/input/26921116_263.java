@Override
    public double cdf(double x) {
        if (x < 0.0) {
            throw new IllegalArgumentException("Invalid x: " + x);
        }

        if (x == 0.0) {
            return 0.;
        }

        return 0.5 * Erf.erfc(-0.707106781186547524 * (Math.log(x) - mu) / sigma);
    }
