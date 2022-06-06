@Override
    public void copyPartFrom(ByteBag from, int fromOffset, int toOffset, int length) {
        ensureCapacity(toOffset + length);
        // Maximum number of elements that can be copied from the given buffer
        int maxLength = from.buffer.length - fromOffset;
        System.arraycopy(from.buffer, fromOffset, buffer, toOffset, Math.min(length, maxLength));
        if (maxLength < length) {
            byte[] buffer = this.buffer;
            for (int i = toOffset + maxLength, n = toOffset + length; i < n; i++)
                buffer[i] = (byte) 0;
        }
    }
