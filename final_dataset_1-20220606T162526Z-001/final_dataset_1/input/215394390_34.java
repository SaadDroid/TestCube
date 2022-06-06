@Override
    public Schema getPartitionSchema(final String catalogName)
    {
        validateMultiplexer(catalogName);
        return this.metadataHandlerMap.get(catalogName).getPartitionSchema(catalogName);
    }
