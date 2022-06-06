@Override
    @GraphTransaction
    public List<String> getEntityList(String entityType) throws RepositoryException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Retrieving entity list for type={}", entityType);
        }

        AtlasGraphQuery query = getGraph().query().has(Constants.ENTITY_TYPE_PROPERTY_KEY, entityType);
        Iterator<AtlasVertex> results = query.vertices().iterator();
        if (!results.hasNext()) {
            return Collections.emptyList();
        }

        ArrayList<String> entityList = new ArrayList<>();
        while (results.hasNext()) {
            AtlasVertex vertex = results.next();
            entityList.add(GraphHelper.getGuid(vertex));
        }

        return entityList;
    }
