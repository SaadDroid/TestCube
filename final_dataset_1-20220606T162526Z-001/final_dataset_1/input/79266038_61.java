@Override
    public ProcessHandle open(int pid, int processAccessFlags) throws ProcessOpenException {
        int handle = openProcess.openProcess(processAccessFlags, false, pid);

        if (handle == WinApiConstants.NULL) {
            Integer lastError = Native.getLastError();
            SystemErrorCode error = SystemErrorCode.fromId(lastError);
            String message = String.format(
                "Failed to open process %d for reading! System error: %s",
                pid,
                error == null ? lastError.toString() : error.toString()
            );
            throw new ProcessOpenException(message);
        }

        return new WinApiProcessHandle(handle);
    }
