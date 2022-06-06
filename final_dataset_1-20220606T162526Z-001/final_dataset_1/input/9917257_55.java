protected boolean uriKeyMatchesScheme(Map<String, Object> serviceData) {
		if (uriSchemes == null) {
			return false;
		}

		Map<String, Object> credentials = getCredentials(serviceData);

		if (credentials != null) {
			for (String uriScheme : uriSchemes) {
				if (credentials.containsKey(uriScheme + "Uri") || credentials.containsKey(uriScheme + "uri") ||
						credentials.containsKey(uriScheme + "Url") || credentials.containsKey(uriScheme + "url")) {
					return true;
				}
			}
		}

		return false;
	}
