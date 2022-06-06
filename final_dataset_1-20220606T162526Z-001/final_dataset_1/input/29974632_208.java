@Override
    public void report(final OutputStream outputStream, final ReportData data, final boolean multiPage) throws IOException {
        writeToStreamHandlingException(outputStream, () -> powerPointService.report(data, multiPage));
    }
