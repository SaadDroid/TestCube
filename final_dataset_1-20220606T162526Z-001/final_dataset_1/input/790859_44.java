@Transformer
    public byte[] toBytes(Reader reader) {
        return toString(reader).getBytes();
    }
