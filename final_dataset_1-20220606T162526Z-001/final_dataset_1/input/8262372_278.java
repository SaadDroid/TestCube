@Override
  public boolean exists(ByteBuffer table, TGet get) throws TIOError, TException {
    HTableInterface htable = getTable(table);
    try {
      return htable.exists(getFromThrift(get));
    } catch (IOException e) {
      throw getTIOError(e);
    } finally {
      closeTable(htable);
    }
  }
