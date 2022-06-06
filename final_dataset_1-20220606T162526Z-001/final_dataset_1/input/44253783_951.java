public AdaptrisMessage decode(byte[] bytes) throws CoreException {
    try (ByteArrayInputStream in = new ByteArrayInputStream(bytes)) {
      return readMessage(in);
    } catch (Exception e) {
      throw new CoreException(e);
    }
  }
