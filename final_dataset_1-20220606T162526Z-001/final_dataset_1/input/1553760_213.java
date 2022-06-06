public MarkupLanguage get(File file) {
		requireNonNull(file);
		String extension = computeFileExtension(file);
		return extensionToMarkupLanguage.get(extension.toLowerCase());
	}
