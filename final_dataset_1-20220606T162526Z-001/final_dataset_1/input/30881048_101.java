public static double magnitude(double base, double n) {
		double logN = Math.log(Math.abs(n))/Math.log(base);
		return Math.signum(n) * Math.pow(base, Math.floor(logN));
	}
