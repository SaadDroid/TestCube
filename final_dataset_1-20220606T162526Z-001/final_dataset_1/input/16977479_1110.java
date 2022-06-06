public static byte[] buildResponse(Map<String, String> headers, byte[] data, int offset, int length) {
        ByteArrayBuilder sb = new ByteArrayBuilder();
        String v = headers.get(SC_KEY);
        if (v != null) {
            sb.append(v).append(CRLF);
        }
        sb.append(headers);

        if (data != null && length > 0) {
            sb.append(CRLF).append(data, offset, length);
        }
        return sb.toByteArray();
    }
