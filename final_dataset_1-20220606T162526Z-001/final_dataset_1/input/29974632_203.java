@Override
    public void map(final OutputStream outputStream, final MapData data, final String title) throws IOException {
        writeToStreamHandlingException(outputStream, () -> powerPointService.map(data, title));
    }
