@Override
    public short getShort() {
        assert remaining() >= Short.BYTES;

        final ByteBuffer shortBuf = shortBufCache.get();
        try {
            final int c = ch.read(shortBuf, this.offset + this.position);
            assert c == Short.BYTES;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.position += Short.BYTES;

        return shortBuf.getShort(0);
    }
