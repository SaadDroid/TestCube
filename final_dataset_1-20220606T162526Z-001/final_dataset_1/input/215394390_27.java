@Override
    public void readWithConstraint(
            final BlockSpiller blockSpiller,
            final ReadRecordsRequest readRecordsRequest, QueryStatusChecker queryStatusChecker)
    {
        validateMultiplexer(readRecordsRequest.getCatalogName());
        this.recordHandlerMap.get(readRecordsRequest.getCatalogName()).readWithConstraint(blockSpiller, readRecordsRequest, queryStatusChecker);
    }
