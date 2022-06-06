@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof AcronymEvent)) {
			return false;
		}
		AcronymEvent other = (AcronymEvent) obj;
		return Objects.equals(text, other.text) && Objects.equals(definition, other.definition);
	}
