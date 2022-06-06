static HttpCharset parse(byte[] bytes, int pos, int length) {
		return charsets.getOrCreate(bytes, pos, length);
	}
