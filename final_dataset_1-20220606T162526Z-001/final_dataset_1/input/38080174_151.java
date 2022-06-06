public static int trimAndDecodePositiveInt(byte[] array, int pos, int len) throws ParseException {
		int left = trimLeft(array, pos, len);
		pos += left;
		len -= left;
		len -= trimRight(array, pos, len);
		return decodePositiveInt(array, pos, len);
	}
