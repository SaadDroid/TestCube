@Override
    @GraphTransaction
    public ITypedReferenceableInstance getEntityDefinition(String guid) throws RepositoryException, EntityNotFoundException {
        return getEntityDefinitions(guid).get(0);
    }
