@Override
    public ListTablesResponse doListTables(BlockAllocator blockAllocator, ListTablesRequest request)
    {
        MongoClient client = getOrCreateConn(request);
        List<TableName> tables = new ArrayList<>();

        try (MongoCursor<String> itr = client.getDatabase(request.getSchemaName()).listCollectionNames().iterator()) {
            while (itr.hasNext()) {
                tables.add(new TableName(request.getSchemaName(), itr.next()));
            }

            return new ListTablesResponse(request.getCatalogName(), tables);
        }
    }
