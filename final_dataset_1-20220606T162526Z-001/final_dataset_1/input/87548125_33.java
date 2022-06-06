public synchronized List<List<T>> getStronglyConnectedComponents() {
		if (stronglyConnectedComponents == null) {
			calculate();
		}

		return stronglyConnectedComponents;
	}
