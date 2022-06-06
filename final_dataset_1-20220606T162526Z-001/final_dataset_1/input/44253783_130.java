@Override
  public void put(byte[] data, File file) throws FsException {
    Args.notNull(file,  "file");
    if (file.exists() && !file.delete()) {
      throw new FsException("Could not delete [" + file + "]");
    }
    super.put(data, file);
  }
