@Override
    public double logp(int k) {
        if (k <= 0) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return (k - 1) * Math.log(1 - p) + Math.log(p);
        }
    }
