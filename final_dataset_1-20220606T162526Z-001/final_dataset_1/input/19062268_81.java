@Override
	public String toString() {
		return
			MoreObjects.
				toStringHelper(getClass()).
					add("charset",name()).
					toString();
	}
