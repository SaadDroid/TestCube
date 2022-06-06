@Override
	public boolean isOfType(Class<?> type) {
		return sameErasedTypeAs(typeOf(type.getName()));
	}
