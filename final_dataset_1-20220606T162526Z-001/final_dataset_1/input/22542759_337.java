FieldLineageDetails getOperationDetails(Constants.FieldLineage.Direction direction, EndPointField endPointField,
                                          long start, long end) {
    List<ProgramFieldOperationInfo> incoming = null;
    List<ProgramFieldOperationInfo> outgoing = null;
    if (direction == Constants.FieldLineage.Direction.INCOMING || direction == Constants.FieldLineage.Direction.BOTH) {
      List<ProgramRunOperations> incomingOperations = fieldLineageReader.getIncomingOperations(endPointField, start,
                                                                                               end);
      incoming = processOperations(incomingOperations);
    }
    if (direction == Constants.FieldLineage.Direction.OUTGOING || direction == Constants.FieldLineage.Direction.BOTH) {
      List<ProgramRunOperations> outgoingOperations = fieldLineageReader.getOutgoingOperations(endPointField, start,
                                                                                               end);
      outgoing = processOperations(outgoingOperations);
    }
    return new FieldLineageDetails(incoming, outgoing);
  }
