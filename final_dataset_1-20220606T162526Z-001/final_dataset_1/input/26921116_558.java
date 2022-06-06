public static DENCLUE fit(double[][] data, double sigma, int m) {
        int n = data.length;
        return fit(data, sigma, m, 1E-2, Math.max(10, n/200));
    }
