public static double cov(int[] x, int[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Arrays have different length.");
        }

        if (x.length < 3) {
            throw new IllegalArgumentException("array length has to be at least 3.");
        }

        double mx = mean(x);
        double my = mean(y);

        double Sxy = 0.0;
        for (int i = 0; i < x.length; i++) {
            double dx = x[i] - mx;
            double dy = y[i] - my;
            Sxy += dx * dy;
        }

        return Sxy / (x.length - 1);
    }
