@NotNull
	public static MemSize kilobytes(long kilobytes) {
		checkArgument(kilobytes <= Long.MAX_VALUE / KB, "Resulting number of bytes exceeds Long.MAX_VALUE");
		return of(kilobytes * KB);
	}
