@Override
    protected void readWithConstraint(BlockSpiller blockSpiller, ReadRecordsRequest readRecordsRequest, QueryStatusChecker queryStatusChecker)
    {
        TableProvider tableProvider = tableProviders.get(readRecordsRequest.getTableName());
        tableProvider.readWithConstraint(blockSpiller, readRecordsRequest, queryStatusChecker);
    }
