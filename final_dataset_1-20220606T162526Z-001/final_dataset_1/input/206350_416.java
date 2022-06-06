public synchronized static byte[] pseudoUniqueByteSequence(int length) {
        if (length < 16) {
            throw new IllegalArgumentException(
                    "Can't generate unique byte sequence shorter than 16 bytes: "
                            + length);
        }

        if (length == 16) {
            return pseudoUniqueByteSequence16();
        }

        byte[] bytes = new byte[length];
        for (int i = 0; i <= length - 16; i += 16) {
            byte[] nextSequence = pseudoUniqueByteSequence16();
            System.arraycopy(nextSequence, 0, bytes, i, 16);
        }

        // leftovers?
        int leftoverLen = length % 16;
        if (leftoverLen > 0) {
            byte[] nextSequence = pseudoUniqueByteSequence16();
            System.arraycopy(nextSequence, 0, bytes, length - leftoverLen, leftoverLen);
        }

        return bytes;
    }
