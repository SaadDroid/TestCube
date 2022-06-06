public boolean isHitRateBreached(Double maxHitRate, Duration maxHitRateDelay) {
		if (maxHitRate == null)
			return false;
		Duration age = getAge();
		if (maxHitRateDelay != null && age.compareTo(maxHitRateDelay) <= 0)
			return false;
		return 1000.0 * hits / age.toMillis() > maxHitRate;
	}
