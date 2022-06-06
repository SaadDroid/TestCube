public FeatureRenamer(Function<String, String> featureNameMapping) {
		Validate.notNull(featureNameMapping, "featureNameMapping must not be null");
		this.featureNameMapping = featureNameMapping;
	}
