protected List<String> readServiceClassNames(URL url) {
		try (InputStream stream = url.openStream()) {
			return readServiceClassNames(stream);
		} catch (IOException e) {
			logReadServiceClassNamesFailure(e);
		}
		return Collections.emptyList();
	}
