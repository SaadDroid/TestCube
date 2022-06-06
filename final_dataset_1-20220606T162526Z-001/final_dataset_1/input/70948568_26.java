public StringCase withSourceChars(String sourceChars) {
		FuzzyPreconditions.checkNotNull(sourceChars);
		return withSourceStrings(FuzzyUtil.toCharSet(sourceChars));
	}
