public static ByteBuffer expandBuffer(ByteBuffer existingBuffer, int additionalRequired) {
        int pos = existingBuffer.position();
        if ((pos + additionalRequired) > existingBuffer.limit()) {
            if ((pos + additionalRequired) < existingBuffer.capacity()) {
                existingBuffer.limit(pos + additionalRequired);
            } else {
                // reallocate the underlying byte buffer and keep the original buffer
                // intact. The resetting of the position is required because, one
                // could be in the middle of a read of an existing buffer, when they
                // decide to over write only few bytes but still keep the remaining
                // part of the buffer unchanged.
                int newCapacity = existingBuffer.capacity() + additionalRequired ;
                java.nio.ByteBuffer newBuffer = java.nio.ByteBuffer.allocate(newCapacity);
                existingBuffer.flip();
                newBuffer.put(existingBuffer);
                return newBuffer;
            }
        }
        return existingBuffer;
    }
