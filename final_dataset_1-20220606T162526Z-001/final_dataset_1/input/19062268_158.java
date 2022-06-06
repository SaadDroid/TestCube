static ImmutableMediaType fromString(final String mediaType, final MediaRangeSyntax syntax) {
		if(mediaType==null) {
			throw new InvalidMediaTypeException("Media type cannot be null");
		}
		if(mediaType.isEmpty()) {
			throw new InvalidMediaTypeException(mediaType,"Media type cannot be empty");
		}
		final String[] parts = mediaType.split(PARAM_SEPARATOR);

		String fullType = parts[0];
		// java.net.HttpURLConnection returns a *; q=.2 Accept header
		if(MediaTypes.WILDCARD_TYPE.equals(fullType)) {
			fullType = "*/*";
		}
		final MediaRange mr=parseMediaRange(mediaType,HttpUtils.trimWhitespace(fullType));
		final Map<String,String> parameters=parseParameters(mediaType,parts);
		try {
			return new ImmutableMediaType(syntax,mr.type,mr.subType,mr.suffix,parameters);
		} catch (final IllegalArgumentException ex) {
			throw new InvalidMediaTypeException(mediaType,ex,"Could not create media type");
		}
	}
