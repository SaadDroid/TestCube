public static Language of(final Locale locale) {
		requireNonNull(locale,"Locale cannot be null");
		checkArgument(locale.getVariant().isEmpty(),"Language does not allow locale variants (%s)",locale.getVariant());
		return new ImmutableLanguage(locale);
	}
