@NotNull
    public static Segment read(
            final int type,
            @NotNull
            final Buffer buffer) {
        final SegmentReader reader = readers.get(type);
        if (reader == null) {
            throw new NoSuchElementException(
                    "No segment reader with type " + type);
        }

        return reader.read(buffer);
    }
