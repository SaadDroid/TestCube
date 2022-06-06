@Override
    public void writeByte(NativeProcess process, int offset, byte value) throws MemoryAccessException {
        ByteBuffer buffer = createLEBuffer(TypeSize.BYTE.getSize());
        buffer.put(value);
        writer.write(process, offset, buffer.array());
    }
