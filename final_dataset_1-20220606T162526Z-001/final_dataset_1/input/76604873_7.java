@Override public boolean getBoolean(@NonNull final String key) {
		assertContainsOrThrow(key);
		return (boolean) map.get(key);
	}
