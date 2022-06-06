public boolean mayInclude(Preference preference) {
		Preference tmp = normalize(preference);
		return this.include.contains(tmp) || (!isOmissiontRequired(tmp) && !isMinimalInclusionRequired());
	}
