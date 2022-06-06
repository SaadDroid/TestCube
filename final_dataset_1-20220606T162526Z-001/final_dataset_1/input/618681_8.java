@Override
	public List<String> loadNBSP(String lang) {
		if (lang == null || lang.isEmpty()) {
			throw new IllegalArgumentException("Lang must be filled to search for file!");
		}
		List<String> result = loadForKey(lang);
		if (result == null) {
			int index = lang.indexOf('_');
			if (index < 0) return null; // cannot split key
			result = loadForKey(lang.substring(0, index));
		}
		return result;
	}
