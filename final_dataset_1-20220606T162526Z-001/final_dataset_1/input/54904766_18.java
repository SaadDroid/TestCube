public static long convertVarIntByteBufferToLong(ByteBuffer byteBuffer) {
	byte[] varIntByteArray=convertVarIntByteBufferToByteArray(byteBuffer);
	return getVarInt(varIntByteArray);
	
}
