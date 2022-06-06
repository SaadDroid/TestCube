public Case<Double> inRange(double minInclusive, double maxInclusive) {
		if(maxInclusive <= minInclusive) {
			throw new IllegalArgumentException("minInclusive must be less than maxInclusive.");
		}

		min = minInclusive;
		max = maxInclusive;

		return this;
	}
