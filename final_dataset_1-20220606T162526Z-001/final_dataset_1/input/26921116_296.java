@Override
    public double quantile(double p) {
        if (p < 0.0 || p > 1.0) {
            throw new IllegalArgumentException("Invalid p: " + p);
        }

        if (p < Math.exp(-lambda)) {
            return 0;
        }

        int n = (int) Math.max(Math.sqrt(lambda), 5.0);
        int nl, nu, inc = 1;

        if (p < cdf(n)) {
            do {
                n = Math.max(n - inc, 0);
                inc *= 2;
            } while (p < cdf(n) && n > 0);
            nl = n;
            nu = n + inc / 2;
        } else {
            do {
                n += inc;
                inc *= 2;
            } while (p > cdf(n));
            nu = n;
            nl = n - inc / 2;
        }

        return quantile(p, nl, nu);
    }
