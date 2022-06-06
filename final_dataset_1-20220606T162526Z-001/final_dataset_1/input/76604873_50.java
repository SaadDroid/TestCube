@Override public int removeAll() {
		final Map<String, ?> values = preferences.getAll();
		int result = 0;
		if (!values.isEmpty()) {
			for (final Map.Entry<String, ?> entry : values.entrySet()) {
				if (preferences.edit().remove(entry.getKey()).commit()) result++;
			}
		}
		return result;
	}
