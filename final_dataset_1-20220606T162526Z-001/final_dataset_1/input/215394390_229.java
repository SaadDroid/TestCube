@Override
    public void getPartitions(BlockWriter blockWriter, GetTableLayoutRequest request, QueryStatusChecker queryStatusChecker)
            throws Exception
    {
        validateTable(request.getTableName());
        //NoOp as we do not support partitioning.
    }
