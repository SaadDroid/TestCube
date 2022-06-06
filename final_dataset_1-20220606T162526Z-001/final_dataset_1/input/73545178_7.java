public static String encrypt(String strSrc) {
		MessageDigest md = null;
		String strDes = null;

		byte[] bt = strSrc.getBytes();
		try {
			md = MessageDigest.getInstance(Algorithm2);
			md.update(bt);
			strDes = byte2hex(md.digest()); // to HexString
		} catch (NoSuchAlgorithmException e) {
			LOG.error("Invalid algorithm.", e);
			return null;
		}
		return strDes;
	}
