@Contract(pure = true)
	@NotNull
	public static <T1, R> Promise<R> toTuple(@NotNull TupleConstructor1<T1, R> constructor, @NotNull Promise<? extends T1> promise1) {
		return promise1.map(constructor::create);
	}
