protected String calculateHelpPrefix(String relativePath) {
		String prefix = helpPrefix == null ? "" : helpPrefix;
		if (relativePath.length() > 0) {
			if (prefix.length() > 0) {
				prefix += "/";
			}
			prefix += relativePath;
		}
		return prefix.length() == 0 ? null : prefix.replaceAll("\\\\", "/");
	}
