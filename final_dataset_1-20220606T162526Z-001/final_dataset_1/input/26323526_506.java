@Override
  public void copyTo(GradoopId target) {
    System.arraycopy(bytes, 0, target.bytes, 0, ID_SIZE);
  }
