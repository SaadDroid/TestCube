@Override
  public long heapSize() {
    long size = ClassSize.align(
        ClassSize.OBJECT +
        // Block type and byte buffer references
        2 * ClassSize.REFERENCE +
        // On-disk size, uncompressed size, and next block's on-disk size
        // bytePerChecksum,  onDiskDataSize and minorVersion
        6 * Bytes.SIZEOF_INT +
        // Checksum type
        1 * Bytes.SIZEOF_BYTE +
        // This and previous block offset
        2 * Bytes.SIZEOF_LONG +
        // "Include memstore timestamp" flag
        Bytes.SIZEOF_BOOLEAN
    );

    if (buf != null) {
      // Deep overhead of the byte buffer. Needs to be aligned separately.
      size += ClassSize.align(buf.capacity() + BYTE_BUFFER_HEAP_SIZE);
    }

    return ClassSize.align(size);
  }
