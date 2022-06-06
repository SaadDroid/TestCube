public String getTextbefore(String source, int offset) {
		if (source == null || source.isEmpty()) {
			return "";
		}
		if (offset <= 0) {
			return "";
		}
		int sourceLength = source.length();
		if (offset > sourceLength) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		int current = offset - 1; // -1 because we want the char before
		boolean ongoing = false;
		do {
			if (current < 0) {
				break;
			}
			char c = source.charAt(current--);
			ongoing = !Character.isWhitespace(c);
			if (ongoing) {
				sb.insert(0, c);
			}
		} while (ongoing);

		return sb.toString();
	}