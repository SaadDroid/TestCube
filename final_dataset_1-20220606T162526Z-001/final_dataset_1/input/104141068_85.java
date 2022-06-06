public static byte[] toBytes(final UUID id) {
        if (id == null) {
            return null; // NOSONAR - Must be null for JDBC
        }

        final byte[] buffer = new byte[16];
        final ByteBuffer bb = ByteBuffer.wrap(buffer);
        bb.putLong(id.getMostSignificantBits());
        bb.putLong(id.getLeastSignificantBits());
        return buffer;
    }
