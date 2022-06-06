@Override
    public void writeStringUTF8(NativeProcess process, int offset, String value) throws MemoryAccessException {
        if (value.length() < 1) {
            throw new IllegalArgumentException("Cannot write empty string!");
        }
        byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
        writer.write(process, offset, bytes);
    }
