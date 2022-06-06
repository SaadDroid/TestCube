@Override
    public long getSizeInBytes() {
        final long elementSize =
                elements.stream()
                        .mapToInt(UnsignedByteArray::length)
                        .sum();

        return Integer.BYTES + // Element count in bytes
                Integer.BYTES + // offsets count in bytes
                sizeOfIndexOffsetValue *
                        databaseDocumentsCount + // indexes offsets in bytes
                Long.BYTES * offsets.size() + // offsets array size in bytes
                elementSize; // Element array size in bytes
    }
