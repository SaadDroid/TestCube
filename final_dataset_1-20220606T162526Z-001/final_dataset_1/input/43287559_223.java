public static byte[] copyOf(byte[] b) {
        if (b == null) {
            return null;
        }
        return copyOf(b, 0, b.length);
    }
