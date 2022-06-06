@Override
    public Optional<String> get(ProcessHandle processHandle) {
        Objects.requireNonNull(processHandle, "processHandle cannot be null!");
        return getProcessImageName(processHandle.getNativeHandle());
    }
