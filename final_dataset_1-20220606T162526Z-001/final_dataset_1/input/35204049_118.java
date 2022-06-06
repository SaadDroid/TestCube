private EntityMutationResponse createOrUpdate(EntityStream entityStream, boolean isPartialUpdate, boolean replaceClassifications) throws AtlasBaseException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("==> createOrUpdate()");
        }

        if (entityStream == null || !entityStream.hasNext()) {
            throw new AtlasBaseException(AtlasErrorCode.INVALID_PARAMETERS, "no entities to create/update.");
        }

        // Create/Update entities
        EntityMutationContext context = preCreateOrUpdate(entityStream, entityGraphMapper, isPartialUpdate);

        EntityMutationResponse ret = entityGraphMapper.mapAttributesAndClassifications(context, isPartialUpdate, replaceClassifications);

        ret.setGuidAssignments(context.getGuidAssignments());

        if (LOG.isDebugEnabled()) {
            LOG.debug("<== createOrUpdate()");
        }

        // Notify the change listeners
        entityChangeNotifier.onEntitiesMutated(ret, entityStream instanceof EntityImportStream);

        return ret;
    }
