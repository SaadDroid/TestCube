@Override
    @GraphTransaction
    public AtlasTypesDef createTypesDef(AtlasTypesDef typesDef) throws AtlasBaseException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("==> AtlasTypeDefGraphStore.createTypesDef(enums={}, structs={}, classifications={}, entities={}, relationships={})",
                    CollectionUtils.size(typesDef.getEnumDefs()),
                    CollectionUtils.size(typesDef.getStructDefs()),
                    CollectionUtils.size(typesDef.getClassificationDefs()),
                    CollectionUtils.size(typesDef.getEntityDefs()),
                    CollectionUtils.size(typesDef.getRelationshipDefs()));
        }

        AtlasTransientTypeRegistry ttr = lockTypeRegistryAndReleasePostCommit();
        tryTypeCreation(typesDef, ttr);


        AtlasTypesDef ret = addToGraphStore(typesDef, ttr);

        if (LOG.isDebugEnabled()) {
            LOG.debug("<== AtlasTypeDefGraphStore.createTypesDef(enums={}, structs={}, classfications={}, entities={}, relationships={})",
                    CollectionUtils.size(typesDef.getEnumDefs()),
                    CollectionUtils.size(typesDef.getStructDefs()),
                    CollectionUtils.size(typesDef.getClassificationDefs()),
                    CollectionUtils.size(typesDef.getEntityDefs()),
                    CollectionUtils.size(typesDef.getRelationshipDefs()));
        }

        return ret;
    }
