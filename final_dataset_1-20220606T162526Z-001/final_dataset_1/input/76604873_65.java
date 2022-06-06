@Nullable static String extractArrayElementsFromPreferenceValue(final String value) {
		if (TextUtils.isEmpty(value)) {
			return null;
		}
		final Matcher matcher = VALUE_PATTERN.matcher(value);
		return matcher.matches() ? matcher.group(2) : null;
	}
