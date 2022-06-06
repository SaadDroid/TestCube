public static String shortString(String string, int max) {
		if (max == 0) {
			return EMPTY;
		}
		if (string == null) {
			return EMPTY;
		}
		if (string.length() <= max) {
			return string;
		}
		/* length > max */
		if (max == 1) {
			return ".";
		}
		if (max == 2) {
			return "..";
		}
		if (max == 3) {
			return "...";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(string.substring(0, max - 3));
		sb.append("...");
		return sb.toString();
	}
