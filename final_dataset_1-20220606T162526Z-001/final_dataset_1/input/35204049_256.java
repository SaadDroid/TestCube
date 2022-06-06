public AtlasQuery createEntityTagQuery(Request request) throws InvalidQueryException {
        ResourceDefinition entityTagDefinition = new EntityTagResourceDefinition();
        QueryExpression queryExpression = create(request, entityTagDefinition);
        String guid = request.getProperty("id");
        return new AtlasEntityTagQuery(queryExpression, entityTagDefinition, guid, request);
    }
