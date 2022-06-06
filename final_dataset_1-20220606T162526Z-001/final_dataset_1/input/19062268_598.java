static <T> boolean isSupported(Class<T> clazz) {
		checkNotNull(clazz,"Class cannot be null");
		return !NullObjectFactory.class.isInstance(ObjectUtil.findObjectFactory(clazz));
	}
