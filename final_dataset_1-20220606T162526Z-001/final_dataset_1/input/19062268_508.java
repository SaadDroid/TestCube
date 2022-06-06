@Override
	public int compareTo(Term other) {
		ImmutableTerm self = this;
		if(self.getDeclaringVocabulary() != other.getDeclaringVocabulary()) {
			throw new ClassCastException();
		}
		return self.ordinal - other.ordinal();
	}
