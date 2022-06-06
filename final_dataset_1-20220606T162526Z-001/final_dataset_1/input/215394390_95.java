@Override
    public GetTableResponse doGetTable(BlockAllocator blockAllocator, GetTableRequest request)
            throws Exception
    {
        logger.info("doGetTable: enter", request.getTableName());
        Schema origSchema = null;
        try {
            if (awsGlue != null) {
                origSchema = super.doGetTable(blockAllocator, request, TABLE_FILTER).getSchema();
            }
        }
        catch (RuntimeException ex) {
            logger.warn("doGetTable: Unable to retrieve table[{}:{}] from AWSGlue.",
                    request.getTableName().getSchemaName(),
                    request.getTableName().getTableName(),
                    ex);
        }

        if (origSchema == null) {
            origSchema = HbaseSchemaUtils.inferSchema(getOrCreateConn(request), request.getTableName(), NUM_ROWS_TO_SCAN);
        }

        SchemaBuilder schemaBuilder = SchemaBuilder.newBuilder();
        origSchema.getFields().forEach((Field field) ->
                schemaBuilder.addField(field.getName(), field.getType(), field.getChildren())
        );

        origSchema.getCustomMetadata().entrySet().forEach((Map.Entry<String, String> meta) ->
                schemaBuilder.addMetadata(meta.getKey(), meta.getValue()));

        schemaBuilder.addField(HbaseSchemaUtils.ROW_COLUMN_NAME, Types.MinorType.VARCHAR.getType());

        Schema schema = schemaBuilder.build();
        logger.info("doGetTable: return {}", schema);
        return new GetTableResponse(request.getCatalogName(), request.getTableName(), schema);
    }
