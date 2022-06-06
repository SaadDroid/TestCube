public boolean isSolrUp(List<String> solrCollections, String... solrCollectionsWithAliases) {
        try {
            return solrCloudAdminProxy.areCollectionsUp(solrCollections, solrCollectionsWithAliases);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return false;
        }
    }
