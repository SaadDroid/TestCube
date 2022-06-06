@Override
    public double quantile(double p) {
        if (p < 0.0 || p > 1.0) {
            throw new IllegalArgumentException("Invalid p: " + p);
        }

        double x = Beta.inverseRegularizedIncompleteBetaFunction(0.5 * nu, 0.5, 2.0 * Math.min(p, 1.0 - p));
        x = Math.sqrt(nu * (1.0 - x) / x);
        return p >= 0.5 ? x : -x;
    }
