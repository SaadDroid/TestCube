public static String decrypt(String encrypted) throws DecryptException {
        String s = null;
        if (encrypted != null) {
            byte[] b = decryptAES(MossoConfig.getCryptoKeySpec(),
                    CryptoUtilValues.TRANSFORMATION_MODE_ECB,
                    CryptoUtilValues.TRANSFORMATION_PADDING_NO_PADDING, CryptoUtil.asBytes(encrypted,
                            CryptoUtilValues.CRYPTO_PAD_BYTE));
            try {
                s = new String(b, ENCODING);
            } catch (UnsupportedEncodingException ex) {
                // This shouldn't happen with UTF-8
                s = new String(b);
            }
            if (s != null) {
                s = s.trim();
            }
        }
        return s;
    }
