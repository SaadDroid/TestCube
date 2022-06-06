public CollectionCase<COLLECTION, ELEMENT> withSize(int size) {
		if(size < 0)
			throw new IllegalArgumentException("CollectionCase's size cannot be less than zero.");

		this.sizeCase = Literal.value(size);
		return this;
	}
