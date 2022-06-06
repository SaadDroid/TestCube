@Override
    public Object decode(InputStream in) throws IOException {
        return decode(new InputStreamSource(in));
    }
