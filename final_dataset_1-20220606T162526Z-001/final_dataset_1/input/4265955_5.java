@Override
    public FileDataStore createDataStore(Map<String, Serializable> params) throws IOException {
        File file = fileFromParams(params);
        URI namespace = (URI) NAMESPACEP.lookUp(params);
        return createDataStoreFromFile(file, namespace);
    }
