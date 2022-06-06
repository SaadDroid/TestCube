public static boolean compareMagics (byte[] magic1,byte[] magic2) {
	if (magic1.length!=magic2.length) {
		return false;
	}
	for (int i=0;i<magic1.length;i++) {
		if (magic1[i]!=magic2[i]) {
			 return false;
		}
	}
	return true;	

}
