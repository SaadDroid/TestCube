public static Language fromString(final String language) {
		requireNonNull(language,"Language cannot be null");
		if(WILDCARD.equals(language)) {
			return wildcard();
		} else {
			return of(parseLocale(language));
		}
	}
