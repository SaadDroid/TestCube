public synchronized List<List<T>> getElementaryCircuits() {
		if (elementaryCircuits == null) {
			calculate();
		}

		return elementaryCircuits;
	}
