@Override
    public long getLong() {
        assert remaining() >= Long.BYTES;

        final ByteBuffer longBuf = longBufCache.get();
        try {
            final int c = ch.read(longBuf, this.offset + this.position);
            assert c == Long.BYTES;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.position += Long.BYTES;

        return longBuf.getLong(0);
    }
