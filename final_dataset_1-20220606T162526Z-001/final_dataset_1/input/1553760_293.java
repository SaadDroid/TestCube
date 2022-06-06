@Override
	public String process(String uri) {
		String newUri = preprocessUri(uri);
		if (!newUri.equals(uri)) {
			newUri = prependWithBasePackage(newUri);
			if (SourceVersion.isName(newUri)) {
				if (isPotentialPackageName(newUri)) {
					return toPackagePage(newUri);
				}
				return toTypePage(newUri);
			}
		}
		return uri;
	}
