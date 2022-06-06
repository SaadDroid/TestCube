public static SelectOptions toSelectOptions(Pageable pageable) {
		final int offset = pageable.getPageNumber() * pageable.getPageSize();
		final int limit = pageable.getPageSize();
		return SelectOptions.get().offset(offset).limit(limit);
	}
