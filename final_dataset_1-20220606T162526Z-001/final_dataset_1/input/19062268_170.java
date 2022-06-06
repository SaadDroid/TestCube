@Override
	public int hashCode() {
		return
			mediaRangeHashCode() ^
			standardParametersHashCode() ^
			customParametersHashCode();
	}
