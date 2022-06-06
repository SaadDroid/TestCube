public String toUTF8(byte[] data) throws UnsupportedEncodingException {
        Reject.ifNull(data);
        return new String(data, ENCODING);
    }
