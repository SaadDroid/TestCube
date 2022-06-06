@Override
  public List<TResult> getScannerResults(ByteBuffer table, TScan scan, int numRows)
      throws TIOError, TException {
    HTableInterface htable = getTable(table);
    List<TResult> results = null;
    ResultScanner scanner = null;
    try {
      scanner = htable.getScanner(scanFromThrift(scan));
      results = resultsFromHBase(scanner.next(numRows));
    } catch (IOException e) {
      throw getTIOError(e);
    } finally {
      if (scanner != null) {
        scanner.close();
      }
      closeTable(htable);
    }
    return results;
  }
