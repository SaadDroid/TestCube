@Override
    public void process(Throwable throwable, StringBuilder output) throws Exception {
        Path stackTraceFile = calculateFilenameForException(throwable);
        writeStacktraceToPathIfNecessary(throwable, stackTraceFile);
        printSubstituteMessage(output, throwable, stackTraceFile);
    }
