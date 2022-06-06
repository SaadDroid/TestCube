public static long bytes_to_int64(Bytes data) {
    return data.toLong(ByteOrder.LITTLE_ENDIAN);
  }
