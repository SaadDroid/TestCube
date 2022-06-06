@Deprecated
    public ProcFd getFileDescriptor() throws SystemInfoException {
        return priorSnaphot().getFileDescriptor();
    }
