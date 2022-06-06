@Override
    public double cdf(double x) {
        if (x < 0.0) {
            throw new IllegalArgumentException("Invalid x: " + x);
        }

        return Beta.regularizedIncompleteBetaFunction(0.5 * nu1, 0.5 * nu2, nu1 * x / (nu2 + nu1 * x));
    }
