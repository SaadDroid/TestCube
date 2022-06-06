@Override
    public void verifySchema(KeyspaceMetadata keyspaceMetadata, String tableName) {
        TableMetadata tableMetadata = keyspaceMetadata.getTable(tableName);
        if(tableMetadata == null) {
            throw new SchemaVerificationException("Table \"%s\" not found in keyspace \"%s\".", tableName, keyspaceMetadata.getName());
        }
        keyBinding.verifySchema(keyspaceMetadata, tableMetadata);
        facetBindings.forEach(facetBinding -> facetBinding.verifySchema(keyspaceMetadata, tableMetadata));
    }
