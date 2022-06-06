public static Object fromPemString(String pemStr) throws PemException {
        byte[] pemBytes;
        Object obj;
        if (pemStr == null) {
            throw new NotAPemObject("String parameter in call to PemUtils.fromPemString(String pem) was null");
        }
        try {
            pemBytes = pemStr.getBytes(RsaConst.USASCII);
            obj = fromPemBytes(pemBytes);
            return obj;
        } catch (UnsupportedEncodingException ex) {
            throw new PemException("Error decoding PEM", ex);
        }
    }
