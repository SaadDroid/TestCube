public static String geohash(final double latitude, final double longitude, int length) {
		return GeoHash.encodeHash(latitude, longitude, length);
	}
