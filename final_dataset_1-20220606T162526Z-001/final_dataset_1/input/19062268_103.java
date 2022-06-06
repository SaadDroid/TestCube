public static boolean isStructured(final MediaType mediaType) {
		requireNonNull(mediaType,MEDIA_TYPE_CANNOT_BE_NULL);
		return mediaType.suffix()!=null;
	}
