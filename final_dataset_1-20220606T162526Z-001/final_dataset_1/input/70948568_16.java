public CollectionCase<COLLECTION, ELEMENT> withSizeOf(Case<Integer> sizeCase) {
		this.sizeCase = FuzzyPreconditions.checkNotNull("sizeCase is required", sizeCase);
		return this;
	}
