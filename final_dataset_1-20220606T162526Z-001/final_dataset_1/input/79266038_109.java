@Override
    public void writeInt(NativeProcess process, int offset, int value) throws MemoryAccessException {
        ByteBuffer buffer = createLEBuffer(TypeSize.INT.getSize());
        buffer.putInt(value);
        writer.write(process, offset, buffer.array());
    }
