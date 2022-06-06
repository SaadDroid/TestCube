@Override
    public void writeCharUTF16LE(NativeProcess process, int offset, char value) throws MemoryAccessException {
        ByteBuffer buffer = createLEBuffer(TypeSize.CHAR_UTF16LE.getSize());
        byte[] bytes = Character.toString(value).getBytes(StandardCharsets.UTF_16LE);
        buffer.put(bytes[0]);
        buffer.put(bytes[1]);
        writer.write(process, offset, buffer.array());
    }
