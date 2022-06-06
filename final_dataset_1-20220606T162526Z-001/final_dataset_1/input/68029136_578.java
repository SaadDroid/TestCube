public static String convertWildCards(String searchText) {
		if (searchText == null) {
			return null;
		}
		
		// replace * with %
		searchText = searchText.replace("%", ESCAPE_CHARACTER + "%").replace(WILDCARD_CHARACTER, '%')
				.replace("_", ESCAPE_CHARACTER + "_");
		
		return searchText;
	}
