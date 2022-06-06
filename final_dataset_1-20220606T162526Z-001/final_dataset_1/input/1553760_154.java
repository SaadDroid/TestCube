public HtmlLanguageBuilder name(String name) {
		requireNonNull(name, "Must provide a name"); //$NON-NLS-1$
		checkArgument(!Strings.isNullOrEmpty(name), "Name must not be empty"); //$NON-NLS-1$
		checkArgument(!name.equalsIgnoreCase(HtmlLanguage.NAME_HTML), "Name must not be equal to %s", //$NON-NLS-1$
				HtmlLanguage.NAME_HTML);
		checkArgument(name.equals(name.trim()), "Name must not have leading or trailing whitespace"); //$NON-NLS-1$
		this.name = name;
		return this;
	}
