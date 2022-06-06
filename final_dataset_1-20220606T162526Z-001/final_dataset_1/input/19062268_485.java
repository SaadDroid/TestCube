public static DurationLiteral duration(long time, TimeUnit unit) {
		checkNotNull(time,TIME_CANNOT_BE_NULL);
		checkNotNull(unit,TIME_UNIT_CANNOT_BE_NULL);
		return of(new Duration(TimeUnit.MILLISECONDS.convert(time, unit)));
	}
