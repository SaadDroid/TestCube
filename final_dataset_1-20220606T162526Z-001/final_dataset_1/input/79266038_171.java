@Override
    public String readStringUTF16LE(NativeProcess process, int offset, int maxCodeUnitsToRead) {
        if (maxCodeUnitsToRead < 1) {
            throw new IllegalArgumentException("Cannot read strings shorter than 1 character!");
        }

        final int charSize = TypeSize.CHAR_UTF16LE.getSize();
        int totalByteSize = maxCodeUnitsToRead * charSize;
        ByteBuffer buffer = ByteBuffer.allocate(totalByteSize);
        buffer.order(ByteOrder.LITTLE_ENDIAN);

        for (int i = 0; i < totalByteSize; i += charSize) {
            short readShort = readShort(process, offset + i);
            if (readShort == 0) {
                // read until null character is met or maxLength is met
                break;
            }
            buffer.putShort(readShort);
        }

        buffer.flip();
        byte[] truncatedBuf = new byte[buffer.remaining()];
        buffer.get(truncatedBuf);
        return new String(truncatedBuf, StandardCharsets.UTF_16LE);
    }
