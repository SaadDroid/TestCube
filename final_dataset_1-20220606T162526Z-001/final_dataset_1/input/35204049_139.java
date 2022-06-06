@Override
    @GraphTransaction
    public CreateUpdateEntitiesResult createEntities(ITypedReferenceableInstance... entities) throws RepositoryException,
        EntityExistsException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("adding entities={}", entities);
        }

        try {
            TypedInstanceToGraphMapper instanceToGraphMapper = new TypedInstanceToGraphMapper(graphToInstanceMapper, deleteHandler);
            instanceToGraphMapper.mapTypedInstanceToGraph(TypedInstanceToGraphMapper.Operation.CREATE, entities);
            List<String> createdGuids = RequestContext.get().getCreatedEntityIds();
            CreateUpdateEntitiesResult result = new CreateUpdateEntitiesResult();
            EntityResult entityResult = new EntityResult(createdGuids, null,  null);
            GuidMapping mapping = instanceToGraphMapper.createGuidMapping();
            result.setEntityResult(entityResult);
            result.setGuidMapping(mapping);
            return result;
        } catch (EntityExistsException e) {
            throw e;
        } catch (AtlasException e) {
            throw new RepositoryException(e);
        }
    }
