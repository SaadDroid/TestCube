public MarkupLanguage getMarkupLanguage(final String languageName) throws IllegalArgumentException {
		checkArgument(!Strings.isNullOrEmpty(languageName), "Must provide a languageName"); //$NON-NLS-1$
		Pattern classNamePattern = Pattern.compile("\\s*([^\\s#]+)?#?.*"); //$NON-NLS-1$
		// first try Java services (jar-based)
		final List<String> names = new ArrayList<>();
		final List<MarkupLanguage> languages = new ArrayList<>();

		final MarkupLanguage[] result = new MarkupLanguage[1];

		loadMarkupLanguages(language -> {
			if (languageName.equals(language.getName())) {
				result[0] = language;
				return false;
			}
			languages.add(language);
			names.add(language.getName());
			return true;
		});
		if (result[0] != null) {
			return result[0];
		}

		// next attempt to load the markup language as if the language name is a fully qualified name
		Matcher matcher = classNamePattern.matcher(languageName);
		if (matcher.matches()) {
			String className = matcher.group(1);
			if (className != null) {
				// first try to load from a discovered markup language since this will circumvent
				//  classloader issues
				for (MarkupLanguage language : languages) {
					if (className.equals(language.getClass().getName())) {
						return language;
					}
				}
				try {
					Class<?> clazz = Class.forName(className, true, classLoader);
					if (MarkupLanguage.class.isAssignableFrom(clazz)) {
						MarkupLanguage instance = (MarkupLanguage) clazz.getConstructor().newInstance();
						return instance;
					}
				} catch (Exception e) {
					// ignore
				}
			}
		}

		Collections.sort(names);

		// specified language not found.
		// create a useful error message
		StringBuilder buf = new StringBuilder();
		for (String name : names) {
			if (buf.length() != 0) {
				buf.append(", "); //$NON-NLS-1$
			}
			buf.append('\'');
			buf.append(name);
			buf.append('\'');
		}
		throw new IllegalArgumentException(MessageFormat.format(Messages.getString("ServiceLocator.4"), //$NON-NLS-1$
				languageName, buf.length() == 0
						? Messages.getString("ServiceLocator.5") //$NON-NLS-1$
						: Messages.getString("ServiceLocator.6") + buf)); //$NON-NLS-1$
	}
