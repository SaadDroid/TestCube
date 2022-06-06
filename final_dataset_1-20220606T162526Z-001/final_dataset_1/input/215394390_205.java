@Override
    public ListTablesResponse doListTables(BlockAllocator blockAllocator, ListTablesRequest request)
            throws Exception
    {
        List<TableName> tableNames = new ArrayList<>();
        com.amazonaws.services.timestreamwrite.model.ListTablesRequest listTablesRequest =
                new com.amazonaws.services.timestreamwrite.model.ListTablesRequest()
                        .withDatabaseName(request.getSchemaName());

        ListTablesResult nextResult = tsMeta.listTables(listTablesRequest);
        List<com.amazonaws.services.timestreamwrite.model.Table> nextTables = nextResult.getTables();
        while (!nextTables.isEmpty()) {
            nextTables.stream().forEach(next -> tableNames.add(new TableName(request.getSchemaName(), next.getTableName())));
            if (nextResult.getNextToken() != null && !nextResult.getNextToken().isEmpty()) {
                listTablesRequest.setNextToken(nextResult.getNextToken());
                nextResult = tsMeta.listTables(listTablesRequest);
                nextTables = nextResult.getTables();
            }
            else {
                nextTables = Collections.EMPTY_LIST;
            }
        }

        return new ListTablesResponse(request.getCatalogName(), tableNames);
    }
