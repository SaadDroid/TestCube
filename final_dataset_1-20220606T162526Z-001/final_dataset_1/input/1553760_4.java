@Override
	public String generateId(String headingText) {
		String id = headingText.toLowerCase(Locale.getDefault());
		id = id.replaceAll("[^a-z0-9_-]", "-"); //$NON-NLS-1$//$NON-NLS-2$
		CharMatcher hyphenMatcher = CharMatcher.is('-');
		id = hyphenMatcher.trimFrom(hyphenMatcher.collapseFrom(id, '-'));
		return id;
	}
