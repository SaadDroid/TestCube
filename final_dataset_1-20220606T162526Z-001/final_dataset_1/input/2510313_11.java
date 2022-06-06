static Optional<String> escapeString(CharSequence unescapedString) {

		if (unescapedString == null) {
			return Optional.empty();
		}

		final StringBuffer stringBuffer = new StringBuffer();
		Matcher matcher = RESERVED_CHARS.matcher(unescapedString);
		while (matcher.find()) {
			matcher.appendReplacement(stringBuffer, "\\\\\\" + matcher.group(1));
		}
		matcher.appendTail(stringBuffer);
		return Optional.of(stringBuffer.toString());
	}
