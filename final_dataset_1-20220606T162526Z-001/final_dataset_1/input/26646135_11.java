public static String encodeToHex(byte[] bytes, boolean uppercase, boolean semicolons) {
		final char[] lookupTable = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
				'e', 'f' };

		final int multiplier = semicolons ? 3 : 2;
		final char[] hexChars = new char[bytes.length * multiplier - (semicolons ? 1 : 0)];
		for (int i = 0; i < bytes.length; i++) {
			final int v = bytes[i] & 0xFF;
			hexChars[i * multiplier] = lookupTable[v >>> 4];
			hexChars[i * multiplier + 1] = lookupTable[v & 0x0F];
			if (i < bytes.length - 1) {
				hexChars[i * multiplier + 2] = ':';
			}
		}
		return uppercase ? new String(hexChars).toUpperCase(Locale.US) : new String(hexChars);
	}
