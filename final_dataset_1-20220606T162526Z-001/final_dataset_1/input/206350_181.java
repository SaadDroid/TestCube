@Override
    public Period fromBytes(byte[] bytes) {
        return Period.parse(new String(bytes, utf8));
    }
