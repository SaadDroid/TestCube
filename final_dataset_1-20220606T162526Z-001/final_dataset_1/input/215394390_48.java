@Override
    public ListSchemasResponse doListSchemaNames(BlockAllocator allocator, ListSchemasRequest request)
            throws Exception
    {
        Set<String> combinedSchemas = new LinkedHashSet<>();
        if (glueClient != null) {
            try {
                combinedSchemas.addAll(super.doListSchemaNames(allocator, request, DB_FILTER).getSchemas());
            }
            catch (RuntimeException e) {
                logger.warn("doListSchemaNames: Unable to retrieve schemas from AWSGlue.", e);
            }
        }

        combinedSchemas.add(DEFAULT_SCHEMA);
        return new ListSchemasResponse(request.getCatalogName(), combinedSchemas);
    }
