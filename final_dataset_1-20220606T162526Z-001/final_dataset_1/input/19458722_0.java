public JSONObject decryptData(final String encryptedData, final String iv) {
		final byte[] aesKey = Base64.decodeBase64(sessionKey);
		final byte[] aesCipher = Base64.decodeBase64(encryptedData);
		final byte[] aesIV = Base64.decodeBase64(iv);

		final byte[] decryptedBytes = AESUtils.decrypt(aesCipher, aesKey, aesIV);
		final String decryptedText = new String(decryptedBytes, Charset.forName("UTF-8"));
		final JSONObject decrypted = JSON.parseObject(decryptedText);

		final String appId = decrypted.getJSONObject("watermark").getString("appid");
		if (!appId.equals(this.appid)) {
			throw new IllegalArgumentException("Invalid Buffer");
		}

		return decrypted;
	}
