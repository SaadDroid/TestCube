@Override
    public double cdf(double x) {
        if (x < 0) {
            return 0.0;
        } else {
            return Gamma.regularizedIncompleteGamma(nu / 2.0, x / 2.0);
        }
    }
