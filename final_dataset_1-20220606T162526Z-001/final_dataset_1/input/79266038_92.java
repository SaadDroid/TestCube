@Override
    public void writeCharUTF8(NativeProcess process, int offset, char value) throws MemoryAccessException {
        ByteBuffer buffer = createLEBuffer(TypeSize.CHAR_UTF8.getSize());
        byte[] bytes = Character.toString(value).getBytes(StandardCharsets.UTF_8);
        buffer.put(bytes[0]);
        writer.write(process, offset, buffer.array());
    }
