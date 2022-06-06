@Override
    @GraphTransaction
    public String getSchema(String datasetName) throws AtlasException {
        datasetName = ParamChecker.notEmpty(datasetName, "table name");
        LOG.info("Fetching schema for tableName={}", datasetName);
        TypeUtils.Pair<String, String> typeIdPair = validateDatasetNameExists(datasetName);

        return getSchemaForId(typeIdPair.left, typeIdPair.right);
    }
