public static byte getVarIntSize(byte firstByteVarInt) {
	int unsignedByte=firstByteVarInt & 0xFF;
	if (unsignedByte==0xFD) {
		 return 3;
	}
	if (unsignedByte==0xFE) {
		return 5;
	}
	if (unsignedByte==0xFF) {
		return 9;
	}
	return 1; //<0xFD
}
