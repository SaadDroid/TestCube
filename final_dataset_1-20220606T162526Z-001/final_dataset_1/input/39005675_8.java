@Override
    public void ensureCapacity(int capacity) {
        if (capacity < 0)
            throw new NegativeArraySizeException(String.valueOf(capacity));
        if (this.buffer.length >= capacity)
            return;
        int newCapacity = Bag.nextPowerOfTwo(capacity);
        float[] newBuffer = new float[newCapacity];
        System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
        this.buffer = newBuffer;
    }
