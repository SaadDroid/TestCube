public String readString(String tag) throws IOException {
        int len = in.readInt();
        if (len == -1) {
            return null;
        }
        checkLength(len);
        byte[] b = new byte[len];
        in.readFully(b);
        return new String(b, StandardCharsets.UTF_8);
    }
