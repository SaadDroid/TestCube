String unescapeBackslashEscapes(String stringWithBackslashEscapes) {
		return stringWithBackslashEscapes.replaceAll(CAPTURING_ESCAPED_CHARS, "$1");
	}
