@Override
    @GraphTransaction
    public String getOutputsGraphForEntity(String guid) throws AtlasException {
        LOG.info("Fetching lineage outputs graph for entity guid={}", guid);
        guid = ParamChecker.notEmpty(guid, "Entity id");
        validateDatasetExists(guid);
        return getOutputsGraphForId(guid);
    }
