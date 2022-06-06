@Override
	public Paint get(int index) {
		Integer key = index;
		if (colorCache.containsKey(key)) {
			return colorCache.get(key);
		}

		// Use the same random numbers for the same input value
		//long seed = Double.doubleToRawLongBits(value);
		//random.setSeed(seed);

		// Generate a new color that is distant enough from previous colors
		boolean match;
		Color r;
		do {
			r = getRandomColor();
			match = true;
			Iterator<Color> colors = colorCache.values().iterator();
			for (int i=0; i<NUM_COMPARISONS && colors.hasNext(); i++) {
				Color prev = colors.next();
				if (distanceSq(r, prev) < MIN_DIST*MIN_DIST) {
					match = false;
					break;
				}
			}
		} while (!match);

		// Remember previous colors to avoid similarities
		colorCache.put(key, r);

		return r;
	}
