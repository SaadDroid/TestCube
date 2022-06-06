@Override
	public Set<String> getDeclaredPrefixes() {
		return ImmutableSet.copyOf(this.map.keySet());
	}
