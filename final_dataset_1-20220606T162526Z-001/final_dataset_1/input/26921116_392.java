public double interpolate(double... x) {
        if (x.length != this.x[0].length) {
            throw new IllegalArgumentException(String.format("Invalid input vector size: %d, expected: %d", x.length, this.x[0].length));
        }

        int n = this.x.length;
        double y = yvi[n];
        for (int i = 0; i < n; i++) {
            y += yvi[i] * variogram.f(rdist(x, this.x[i]));
        }

        return y;
    }
