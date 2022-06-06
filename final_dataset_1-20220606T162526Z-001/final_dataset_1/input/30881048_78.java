@Override
	public boolean add(T e) {
		if (elements.isEmpty()) {
			elements.add(e);
			return true;
		}
		int index = Collections.binarySearch(elements, e);
		if (index < 0) {
			index = -index - 1;
		}
		elements.add(index, e);
		return true;
	}
