public static <T> Collector<T, RefBoolean, Boolean> toNone(Predicate<T> predicate) {
		return Collector.of(
				() -> new RefBoolean(true),
				(a, t) -> a.value &= !predicate.test(t),
				(a1, a2) -> {
					a1.value &= a2.value;
					return a1;
				},
				b -> b.value);
	}
