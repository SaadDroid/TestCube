@Override
	public int compareTo(Version v) {
		return new CompareToBuilder()
			.append(major, v.major)
			.append(minor, v.minor)
			.append(maintenance, v.maintenance)
			.toComparison();
	}
