@Override
	public FeatureVector apply(FeatureVector featureVector) {
		String text = getTextValue(featureVector);
		Iterator<String> tokenIterator = preprocessor.apply(text);
		Bag<String> tokens = new Bag<>(CollectionHelper.newArrayList(tokenIterator));

		InstanceBuilder instanceBuilder = new InstanceBuilder();
		Entry<String, Integer> maxTokenEntry = tokens.getMax();
		Integer maxTokenCount = maxTokenEntry != null ? maxTokenEntry.getValue() : 0;
		
		// in case alpha is zero, only the document's tokens need to be iterated;
		// and zero values can simply be skipped. Else we need to iterate over the 
		// entire corpus (smoothing)
		TermCorpus vocabulary = alpha == 0 ? new MapTermCorpus(tokens, 1) : termCorpus;

		for (String token : vocabulary) {
			Integer count = tokens.count(token) + alpha;
			float tf = tfStrategy.calc(count, tokens.size(), maxTokenCount);
			float idf = idfStrategy.calc(termCorpus.getCount(token), termCorpus.getNumDocs(), maxTokenCount);
			float value = tf * idf;
			instanceBuilder.set(token, new ImmutableFloatValue(value));
		}
		return instanceBuilder.create();
	}
