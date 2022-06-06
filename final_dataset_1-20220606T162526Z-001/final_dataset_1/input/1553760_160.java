public HtmlLanguageBuilder addSubstitution(SpanType spanType, String alternativeTagName) {
		requireNonNull(spanType, "Must provide a spanType"); //$NON-NLS-1$
		requireNonNull(alternativeTagName, "Must provide an alternativeTagName"); //$NON-NLS-1$
		spanTypeToElementNameSubstitution.put(spanType, alternativeTagName);
		return this;
	}
