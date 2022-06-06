@Override
    public String transform(final byte[] from) {
        if (from == null) {
            return null;
        }
        return new String(from);
    }
