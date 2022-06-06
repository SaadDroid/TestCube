@Override
    public ResourceSearchIndexes getIndexes(String resource, String realm) throws EntitlementException {
        return DELEGATE.getIndexes(resource, realm);
    }
