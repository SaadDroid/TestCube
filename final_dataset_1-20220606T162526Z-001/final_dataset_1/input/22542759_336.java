FieldLineageSummary getFieldLineage(Constants.FieldLineage.Direction direction, EndPointField endPointField,
                                      long start, long end) {
    Set<DatasetField> incoming = null;
    Set<DatasetField> outgoing = null;
    if (direction == Constants.FieldLineage.Direction.INCOMING || direction == Constants.FieldLineage.Direction.BOTH) {
      Set<EndPointField> incomingSummary = fieldLineageReader.getIncomingSummary(endPointField, start, end);
      incoming = convertSummaryToDatasetField(incomingSummary);
    }
    if (direction == Constants.FieldLineage.Direction.OUTGOING || direction == Constants.FieldLineage.Direction.BOTH) {
      Set<EndPointField> outgoingSummary = fieldLineageReader.getOutgoingSummary(endPointField, start, end);
      outgoing = convertSummaryToDatasetField(outgoingSummary);
    }
    return new FieldLineageSummary(incoming, outgoing);
  }
