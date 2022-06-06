public static void encodeAndStream(byte[] id,
                                       int o,
                                       int l,
                                       OutputStream os) throws IOException {
        encodeAndStream(id, o, l, false, os);
    }
