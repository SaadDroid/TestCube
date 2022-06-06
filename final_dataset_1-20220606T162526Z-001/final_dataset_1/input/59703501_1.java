@Override
    public Iterator<FetchedData> fetch(Iterator<Resource> resources) throws Exception {
        return new StreamTransformer<>(resources, this);
    }
