public final Set<MarkupLanguage> getMarkupLanguages() {
		Set<MarkupLanguage> languages = ImmutableSet
				.copyOf(Objects.requireNonNull(loadMarkupLanguages(), "loadMarkupLanguages() must not return null")); //$NON-NLS-1$
		assertLanguageNames(languages);
		return languages;
	}
