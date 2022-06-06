@Override
	public final boolean equals(final Object obj) {
		if (obj instanceof UrlSchemaSupplier) {
			final UrlSchemaSupplier other = (UrlSchemaSupplier)obj;
			return this.getUrl().equals(other.getUrl());
		}
		return false;
	}
