@Override
	@SuppressWarnings("rawtypes")
	public List<Metric> getMetrics() {
		return asList(PACKAGE_DEPENDENCY_CYCLES, PACKAGE_DEPENDENCY_CYCLES_IDENTIFIER,
				PACKAGE_DEPENDENCY_CYCLES_IDENTIFIERS);
	}
