@Override
  public WritableBuffer allocate(int capacityHint) {
    capacityHint = Math.min(MAX_BUFFER, Math.max(MIN_BUFFER, capacityHint));
    return new OkHttpWritableBuffer(new Buffer(), capacityHint);
  }
