public static byte[] toBytes(byte[][] byteArrays) {
        int size = 0;
        for (byte[] b : byteArrays) {
            if (b == null) {
                size++;
            } else {
                size += b.length;
                size += WritableUtils.getVIntSize(b.length);
            }
        }
        TrustedByteArrayOutputStream bytesOut = new TrustedByteArrayOutputStream(size);
        DataOutputStream out = new DataOutputStream(bytesOut);
        try {
            for (byte[] b : byteArrays) {
                if (b == null) {
                    WritableUtils.writeVInt(out, 0);
                } else {
                    WritableUtils.writeVInt(out, b.length);
                    out.write(b);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e); // not possible
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e); // not possible
            }
        }
        return bytesOut.getBuffer();
    }
