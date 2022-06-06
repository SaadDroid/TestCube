@Override
	public String toString() {
		return toStringHelper(TextSegment.class).add("text", ToStringHelper.toStringValue(text)).toString();
	}
