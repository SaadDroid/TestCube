@Override
  public void processRecords(ProcessRecordsInput processRecordsInput) {
    for (Record record : processRecordsInput.getRecords()) {
      byte[] serialized = record.getData().array();
      metrics.incrementMessages();
      metrics.incrementBytes(serialized.length);
      collector.acceptSpans(serialized, NOOP); // async
    }
  }
