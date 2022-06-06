@Override
    public ListTablesResponse doListTables(BlockAllocator allocator, ListTablesRequest request)
            throws RuntimeException
    {
        logger.debug("doListTables: enter - " + request);

        List<TableName> indices = new ArrayList<>();

        try {
            String endpoint = getDomainEndpoint(request.getSchemaName());
            AwsRestHighLevelClient client = clientFactory.getOrCreateClient(endpoint);
            try {
                for (String index : client.getAliases()) {
                    // Ignore all system indices starting with period `.` (e.g. .kibana, .tasks, etc...)
                    if (index.startsWith(".")) {
                        logger.info("Ignoring system index: {}", index);
                        continue;
                    }

                    indices.add(new TableName(request.getSchemaName(), index));
                }
            }
            catch (IOException error) {
                throw new RuntimeException("Error retrieving indices: " + error.getMessage(), error);
            }
        }
        catch (RuntimeException error) {
            throw new RuntimeException("Error processing request to list indices: " + error.getMessage(), error);
        }

        return new ListTablesResponse(request.getCatalogName(), indices);
    }
