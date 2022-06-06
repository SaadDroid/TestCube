protected List<String> listRuntimeDependencies(String collectionName) throws IOException, SolrServerException {
        logger.debug("Checking runtime-dependencies for collection {}", collectionName);
        ModifiableSolrParams params = new ModifiableSolrParams().set("file",RUNTIME_LIB_FILE_NAME);
        SolrRequest request = new QueryRequest(params);
        request.setPath("/admin/file");
        request.setResponseParser(new InputStreamResponseParser("json"));

        try (CloudSolrClient client = createCloudSolrClient()) {
            final NamedList o = client.request(request, collectionName);

            final LineIterator it = IOUtils.lineIterator((InputStream) o.get("stream"), "utf-8");

            final List<String> returnValues = Streams.stream(it).collect(Collectors.toList());

            //if file not exists (a little hacky..)
            if (returnValues.size() == 1 && returnValues.get(0).startsWith("{\"responseHeader\":{\"status\":404")) {
                logger.warn("Release does not yet contain rumtimelib configuration file. Runtimelibs have to be installed manually.");
                return Collections.emptyList();
            }
            return returnValues;
        }
    }
