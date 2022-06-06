@Override
  public Iterable<String> convertRecord(Object outputSchema, Text inputRecord, WorkUnitState workUnit)
      throws DataConversionException {
    return new SingleRecordIterable<String>(inputRecord.toString());
  }
