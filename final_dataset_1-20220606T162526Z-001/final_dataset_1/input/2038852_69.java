public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
