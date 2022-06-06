@Override
    public ByteBuffer read(NativeProcess process, int offset, int bytesToRead) {
        Objects.requireNonNull(process, "process cannot be null!");
        if (bytesToRead < 1) {
            throw new IllegalArgumentException("Cannot read fewer than 1 byte!");
        }

        ByteBuffer buffer = ByteBuffer.allocate(bytesToRead);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        try (SeekableByteChannel input = readableMemoryProvider.openRead(process.getPid())) {

            long bytesToSkip = 0xFFFFFFFFL & offset; // interpret the offset as an unsigned value
            input.position(bytesToSkip);

            int bytesRead = input.read(buffer);
            if (bytesRead == -1) {
                // SeekableByteChannel.position sets position even if it goes out of bounds,
                // but any subsequent reads or writes will return EOF
                throw new MemoryAccessException("Reading process memory failed! Reached end of memory!");
            }
            if (bytesRead != bytesToRead) {
                throw new MemoryAccessException("Only " + bytesRead + " bytes out of " + bytesToRead + " could be read!");
            }

            buffer.flip();
            return buffer;
        } catch (ProcessOpenException | IOException ex) {
            throw new MemoryAccessException("Reading process memory failed, see getCause()!", ex);
        }
    }
