@Override
    public NativeProcess collect(int pid) {
        NativeProcess process = new NativeProcessImpl(
            pid,
            NativeProcess.UNKNOWN_DESCRIPTION,
            NativeProcess.UNKNOWN_OWNER);

        try (ProcessHandle handle = processOpener.open(pid, ProcessAccessFlags.QUERY_INFORMATION)) {
            String description = descriptionGetter.get(handle).orElse(NativeProcess.UNKNOWN_DESCRIPTION);
            String owner = ownerGetter.get(handle).orElse(NativeProcess.UNKNOWN_OWNER);
            process.setDescription(description);
            process.setOwner(owner);
        } catch (ProcessOpenException ex) {
            // TODO: log
        }

        return process;
    }
