@Contract(pure = true)
	@NotNull
	public static Promise<?> some(int number) {
		if (number == 0) return Promise.of(emptyList());

		return Promise.ofException(new StacklessException(Promises.class,
				"There are no promises to be complete"));
	}
