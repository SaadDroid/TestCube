@SuppressWarnings("unchecked")
	@Contract(pure = true)
	@NotNull
	public static <T> Promise<T[]> toArray(@NotNull Class<T> type) {
		return Promise.of((T[]) Array.newInstance(type, 0));
	}
