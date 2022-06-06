@Override
    public void write(NativeProcess process, int offset, byte[] buffer) throws MemoryAccessException {
        Objects.requireNonNull(process, "process cannot be null!");
        Objects.requireNonNull(buffer, "buffer cannot be null!");
        if (buffer.length < 1) {
            throw new IllegalArgumentException("Can't write fewer than 1 byte!");
        }

        try (ProcessHandle handle = processOpener.open(process.getPid(), FLAGS_WRITEMEMORY)) {
            boolean success = memoryWriter.writeProcessMemory(
                handle.getNativeHandle(),
                offset,
                buffer,
                buffer.length,
                null);

            if (!success) {
                // if we want to retry by VirtualProtectEx'ing us some rights to the memory, retry here?
                int errorCode = Native.getLastError();
                throw createReadExceptionFromErrorCode(errorCode);
            }
        }
    }
