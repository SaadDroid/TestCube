public static String longToIpv4(long ipAsLong) {
		Validate.inclusiveBetween(LOWEST_IP, HIGHEST_IP, ipAsLong);
		int octetA = (int) ((ipAsLong >> 24) % 256);
		int octetB = (int) ((ipAsLong >> 16) % 256);
		int octetC = (int) ((ipAsLong >> 8) % 256);
		int octetD = (int) ((ipAsLong) % 256);
		return octetA + "." + octetB + "." + octetC + "." + octetD;
	}
