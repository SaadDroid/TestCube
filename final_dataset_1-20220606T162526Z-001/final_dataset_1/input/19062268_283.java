static Type loadType(Class<?> clazz, TypeManager manager) {
		Objects.requireNonNull(clazz,"Class cannot be null");
		Objects.requireNonNull(manager,"Type manager cannot be null");
		return new TypeLoader(manager).load(clazz);
	}
