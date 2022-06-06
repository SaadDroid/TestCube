public static int decodeInt(InputStream buf) throws IOException {
        long r = decodeLong(buf);
        if (r < 0 || r >= 1L << 32) {
            throw new IOException("var int overflow " + r);
        }
        return (int) r;
    }
