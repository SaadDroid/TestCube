public static String decode(String strIn) throws PaddingException, UnsupportedEncodingException {
        byte[] bytesIn = strIn.getBytes("utf-8");
        byte[] bytesOut = decode(bytesIn, bytesIn.length);
        return new String(bytesOut);
    }
