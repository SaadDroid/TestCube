@Override
    public int read() throws IOException {
        while (true) {
            final int read = super.read();
            if (read == -1) {
                return -1;
            } else if (!filtered((byte) read)) {
                return read;
            }
        }
    }
