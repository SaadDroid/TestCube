public static byte[] decodeFromHex(String hexString) throws IllegalArgumentException {
		// This code is actually a slightly modified copy of the code in the Pin(String) constructor.
		hexString = hexString.toLowerCase(Locale.US);
		// Replace all ':' and whitespace characters with the empty string, i.e. remove them from pinHexString
		hexString = hexString.replaceAll("[:\\s]", "");

		final char[] pinHexChars = hexString.toCharArray();
		final int length = pinHexChars.length;
		if (length % 2 != 0) {
			throw new IllegalArgumentException(
					"HEX String length, with whitespace and semicolons removed, must be divisible by 2 as two characters are needed to decode a single byte!");
		}

		final byte[] pinBytes = new byte[length / 2];
		for (int i = 0; i < length; i += 2) {

			final char one = pinHexChars[i];
			final char two = pinHexChars[i + 1];
			if (!((one >= 'a' && one <= 'f') || (one >= '0' && one <= '9'))
					|| !((two >= 'a' && two <= 'f') || (two >= '0' && two <= '9'))) {
				throw new IllegalArgumentException(
						"HEX String must only contain whitespaces, semicolons (':'), and ASCII letters [a-fA-F] and numbers [0-9]!");
			}

			pinBytes[i / 2] = (byte) ((Character.digit(one, 16) << 4) + Character.digit(two, 16));
		}
		return pinBytes;
	}
