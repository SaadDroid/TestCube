@Override
	public boolean isEmpty(D op) {
		for (D1 operation : getter1.apply(op)) {
			if (!otSystem1.isEmpty(operation)) {
				return false;
			}
		}
		for (D2 operation : getter2.apply(op)) {
			if (!otSystem2.isEmpty(operation)) {
				return false;
			}
		}
		return true;
	}
