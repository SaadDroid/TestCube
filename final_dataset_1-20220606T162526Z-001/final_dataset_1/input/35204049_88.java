@Override
    @GraphTransaction
    public String getInputsGraph(String tableName) throws AtlasException {
        LOG.info("Fetching lineage inputs graph for tableName={}", tableName);
        tableName = ParamChecker.notEmpty(tableName, "table name");
        TypeUtils.Pair<String, String> typeIdPair = validateDatasetNameExists(tableName);
        return getInputsGraphForId(typeIdPair.right);
    }
