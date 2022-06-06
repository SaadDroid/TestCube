public static Guid fromHasGuid(HasGuid... objs) throws IOException {
    byte[][] byteArrays = new byte[objs.length][];
    for (int i = 0; i < objs.length; i++) {
      byteArrays[i] = objs[i].guid().sha;
    }
    return fromByteArrays(byteArrays);
  }
