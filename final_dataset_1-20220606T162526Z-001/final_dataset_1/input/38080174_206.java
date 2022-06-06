public static <T> Collector<T, Ref<T>, T> toLast() {
		return Collector.of(
				Ref::new,
				(a, v) -> a.value = v,
				(a1, a2) -> a1,
				a -> a.value);
	}
