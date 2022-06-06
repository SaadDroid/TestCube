@Override
    public final double value(double x) {
        return this.sign * (FastMath.pow(1.0-FastMath.pow(x,2.0),m/2.0) * legendre.value(x));
    }
