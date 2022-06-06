public static <E extends Enum<E>> SimpleConfigConverter<E> ofEnum(Class<E> enumClass) {
		Class<E> enumClass1 = enumClass;
		return new SimpleConfigConverter<E>() {
			private final Class<E> enumClass = enumClass1;

			@Override
			public E fromString(String string) {
				return Enum.valueOf(enumClass, string);
			}

			@Override
			public String toString(E value) {
				return value.name();
			}
		};
	}
