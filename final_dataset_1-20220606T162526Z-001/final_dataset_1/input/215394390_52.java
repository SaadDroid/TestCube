@Override
    public GetTableResponse doGetTable(BlockAllocator allocator, GetTableRequest request)
            throws Exception
    {
        if (glueClient != null) {
            try {
                // does not validate that the table is actually a DDB table
                return super.doGetTable(allocator, request);
            }
            catch (RuntimeException e) {
                logger.warn("doGetTable: Unable to retrieve table {} from AWSGlue in database/schema {}. " +
                                "Falling back to schema inference. If inferred schema is incorrect, create " +
                                "a matching table in Glue to define schema (see README)",
                        request.getTableName().getTableName(), request.getTableName().getSchemaName(), e);
            }
        }

        // ignore database/schema name since there are no databases/schemas in DDB
        Schema schema = tableResolver.getTableSchema(request.getTableName().getTableName());
        return new GetTableResponse(request.getCatalogName(), request.getTableName(), schema);
    }
