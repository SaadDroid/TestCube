public Long getVersionAndInstallIfNecessary(String dependency) {

        try (CloudSolrClient client = createCloudSolrClient()) {
            SolrQuery query = new SolrQuery("blobName:"+Utils.toBlobName(dependency));
            query.setSort("version", SolrQuery.ORDER.desc);
            QueryResponse response = client.query(".system",query);

            if(response.getResults().getNumFound() > 0) { //should could look for updates here as well?

                return Long.valueOf(response.getResults().get(0).get("version").toString());
            } else {
                Path configDirectory = Files.createTempDirectory(Utils.normalizeFileName(dependency));

                Path jarFile = Utils.downloadToTempDir(configDirectory, repositories, dependency);
                return uploadRuntimeLib(dependency, jarFile);
            }

        } catch (SolrServerException | IOException e) {
            logger.warn("Cannot load runtime dependeny " + dependency + ". This may cause runtime issues.");
            return -1L;
        }
    }
