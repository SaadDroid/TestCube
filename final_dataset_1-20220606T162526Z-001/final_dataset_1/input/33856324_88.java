@Override
    public void encode(Object group, OutputStream out) throws IOException {
        encode(group, new OutputStreamSink(out));
    }
