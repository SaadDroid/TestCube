public double d(int[] x, int[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException(String.format("Arrays have different length: x[%d], y[%d]", x.length, y.length));
        }

        double dist = 0.0;

        if (weight == null) {
            for (int i = 0; i < x.length; i++) {
                double d = Math.abs(x[i] - y[i]);
                dist += Math.pow(d, p);
            }
        } else {
            if (x.length != weight.length) {
                throw new IllegalArgumentException(String.format("Input vectors and weight vector have different length: %d, %d", x.length, weight.length));
            }

            for (int i = 0; i < x.length; i++) {
                double d = Math.abs(x[i] - y[i]);
                dist += weight[i] * Math.pow(d, p);
            }
        }

        return Math.pow(dist, 1.0/p);
    }
