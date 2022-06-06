@Override
    public void writeShort(NativeProcess process, int offset, short value) throws MemoryAccessException {
        ByteBuffer buffer = createLEBuffer(TypeSize.SHORT.getSize());
        buffer.putShort(value);
        writer.write(process, offset, buffer.array());
    }
