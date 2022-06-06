@Override
  public void onMessage(Integer numberOfMessagesToSend) {
    if (this.close) {
      return;
    }
    long numberOfMsgsLeft = numberOfMessagesToSend;
    List<Result> scanResults = new ArrayList<>();
    List<Integer> cellsPerResult = new ArrayList<>();
    ByteBuffer previousRow = null;
    while (!this.close && numberOfMsgsLeft > 0) {
      int rowsToSend = 0;
      boolean moreResults;
      do {
        List<Cell> rawCells = new ArrayList<>();

        try {
          // Arguably you should only return numberOfMessages, but I figure it can't hurt that
          // much to pass them up
          moreResults = scanner.nextRaw(rawCells);
          if (!moreResults) {
            this.scanner.close();
            this.close = true;
          }
        } catch (IOException e) {
          e.printStackTrace();
          return;
        }

        List<c5db.client.generated.Cell> cells = new ArrayList<>();
        for (Cell cell : rawCells) {
          ByteBuffer cellBufferRow = ByteBuffer.wrap(cell.getRowArray(), cell.getRowOffset(), cell.getRowLength());
          // If we are not the first one and we are a different row than the previous
          cells.add(ReverseProtobufUtil.toCell(cell));

          if (!(previousRow == null || previousRow.compareTo(cellBufferRow) == 0)) {
            cellsPerResult.add(cells.size());
            scanResults.add(new Result(cells, cells.size(), cells.size() > 0));
            cells = new ArrayList<>();
          }
          previousRow = ByteBuffer.wrap(cell.getRowArray(), cell.getRowOffset(), cell.getRowLength());
        }
        // Add the last one
        if (cells.size() > 0) {
          cellsPerResult.add(cells.size());
          scanResults.add(new Result(cells, cells.size(), cells.size() > 0));
        }
        rowsToSend++;
        // Our super advanced scanning algorithm. Could be greatly improved
      } while (moreResults && rowsToSend < 100 && numberOfMessagesToSend - rowsToSend > 0);
      ScanResponse scanResponse = new ScanResponse(cellsPerResult, scannerId, moreResults, 0, scanResults);
      Response response = new Response(Response.Command.SCAN, call.getCommandId(), null, null, scanResponse, null);
      ctx.writeAndFlush(response);
      numberOfMsgsLeft -= rowsToSend;
    }
  }
