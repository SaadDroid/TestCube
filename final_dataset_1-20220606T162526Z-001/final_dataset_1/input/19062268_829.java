public static ContentPreferences fromPreferenceHeader(String header) {
		checkNotNull("Preference header cannot be null");
		String[] preferenceParts = header.split(";");
		validatePrefix(header, preferenceParts[0]);
		ContentPreferencesBuilder builder = ContentPreferences.builder();
		if(preferenceParts.length==1) {
			throw new InvalidPreferenceHeaderException("Could not parse preference ("+header+"): invalid return representation preference configuration");
		}
		populatePreferences(builder,Arrays.copyOfRange(preferenceParts,1,preferenceParts.length,String[].class));
		return builder.build();
	}
