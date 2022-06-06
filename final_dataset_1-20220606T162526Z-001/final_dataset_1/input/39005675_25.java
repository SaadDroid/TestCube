@Override
    public void clear() {
        char[] buffer = this.buffer;
        for (int i = 0, n = buffer.length; i < n; ++i)
            buffer[i] = (char) 0;
    }
