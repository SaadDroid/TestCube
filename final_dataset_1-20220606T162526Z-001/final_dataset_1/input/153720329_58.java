@Override
    void ensureCapacity(long pos) {
        if (pos < mem.length) {
            return;
        }
        if (pos > MAX_ARRAY_SIZE) {
            throw new IllegalArgumentException(String.format("pos >= MAX_ARRAY_SIZE, pos: %d", pos));
        }
        mem = Arrays.copyOf(mem, expand(mem.length, pos));
    }
