@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof BeginBlockEvent)) {
			return false;
		}
		BeginBlockEvent other = (BeginBlockEvent) obj;
		return type == other.type;
	}
