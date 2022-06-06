@Override
    public boolean isReadable() {
        return readFile != null && readFile.exists();
    }
