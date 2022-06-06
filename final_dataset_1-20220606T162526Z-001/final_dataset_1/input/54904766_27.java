public static long getSize(byte[] byteSize) {
	if (byteSize.length!=4) {
		return 0;
	}
	ByteBuffer converterBuffer = ByteBuffer.wrap(byteSize);
	converterBuffer.order(ByteOrder.LITTLE_ENDIAN);
	return convertSignedIntToUnsigned(converterBuffer.getInt());
}
