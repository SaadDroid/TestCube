static String trimWhitespace(final String token) {
		checkNotNull(token,"Token cannot be null");
		int startOffset=0;
		int endOffset=token.length();
		while(startOffset<endOffset) {
			final char lastChar=token.charAt(startOffset);
			if(!HttpUtils.isWhitespace(lastChar)) {
				break;
			}
			startOffset++;
		}
		while(endOffset>startOffset) {
			final char lastChar=token.charAt(endOffset-1);
			if(!HttpUtils.isWhitespace(lastChar)) {
				break;
			}
			endOffset--;
		}
		return token.substring(startOffset,endOffset);
	}
