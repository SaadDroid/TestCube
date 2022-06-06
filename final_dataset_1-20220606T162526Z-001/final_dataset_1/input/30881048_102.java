public static double quantile(List<Double> values, double q) {
		// R type 7 parameters
		double a = 1.0, b = -1.0, c = 0.0, d = 1.0;
		// Number of samples
		int n = values.size();

		double x = a + (n + b) * q - 1.0;
		double xInt = (int) x;
		double xFrac = x - xInt;

		if (xInt < 0) {
			return values.get(0);
		} else if (xInt >= n) {
			return values.get(n - 1);
		}

		int i = (int) xInt;
		if (xFrac == 0) {
			return values.get(i);
		}
		return values.get(i) + (values.get(i + 1) - values.get(i))*(c + d*xFrac);
	}
