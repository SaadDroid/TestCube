public String enhance(String input, String lang) {
		if (input == null) return null;
		if (input.isEmpty()) return "";
		if (lang == null || lang.isEmpty()) return input;
		List<String> rules = loader.loadNBSP(lang);
		if (rules == null) return input;
		for (String r : rules) {
			Matcher m = Pattern.compile(r).matcher(input);
			if (m.groupCount() != 3) {
				throw new IllegalArgumentException("Expression must contain exactly 3 groups! " + r);
			}
			if (m.find()) {
				input = m.replaceAll("$1\u00A0$3");
			}
		}
		return input;
	}
