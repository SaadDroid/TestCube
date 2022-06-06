@Override
    public double p(double x) {
        if (x <= 0) {
            return 0.0;
        } else {
            return Math.exp(logp(x));
        }
    }
