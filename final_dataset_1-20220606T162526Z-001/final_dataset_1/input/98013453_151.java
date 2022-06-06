@Override
    @GraphTransaction
    public void deleteTypesDef(AtlasTypesDef typesDef) throws AtlasBaseException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("==> AtlasTypeDefGraphStore.deleteTypesDef(enums={}, structs={}, classfications={}, entities={}, relationships={}, businessMetadataDefs={})",
                    CollectionUtils.size(typesDef.getEnumDefs()),
                    CollectionUtils.size(typesDef.getStructDefs()),
                    CollectionUtils.size(typesDef.getClassificationDefs()),
                    CollectionUtils.size(typesDef.getEntityDefs()),
                    CollectionUtils.size(typesDef.getRelationshipDefs()),
                    CollectionUtils.size(typesDef.getBusinessMetadataDefs()));
        }

        AtlasTransientTypeRegistry ttr = lockTypeRegistryAndReleasePostCommit();

        AtlasDefStore<AtlasEnumDef>             enumDefStore             = getEnumDefStore(ttr);
        AtlasDefStore<AtlasStructDef>           structDefStore           = getStructDefStore(ttr);
        AtlasDefStore<AtlasClassificationDef>   classifiDefStore         = getClassificationDefStore(ttr);
        AtlasDefStore<AtlasEntityDef>           entityDefStore           = getEntityDefStore(ttr);
        AtlasDefStore<AtlasRelationshipDef>     relationshipDefStore     = getRelationshipDefStore(ttr);
        AtlasDefStore<AtlasBusinessMetadataDef> businessMetadataDefStore = getBusinessMetadataDefStore(ttr);

        List<AtlasVertex> preDeleteStructDefs   = new ArrayList<>();
        List<AtlasVertex> preDeleteClassifiDefs = new ArrayList<>();
        List<AtlasVertex> preDeleteEntityDefs   = new ArrayList<>();
        List<AtlasVertex> preDeleteRelationshipDefs = new ArrayList<>();

        // pre deletes

        // do the relationships first.
        if (CollectionUtils.isNotEmpty(typesDef.getRelationshipDefs())) {
            for (AtlasRelationshipDef relationshipDef : typesDef.getRelationshipDefs()) {
                if (StringUtils.isNotBlank(relationshipDef.getGuid())) {
                    preDeleteRelationshipDefs.add(relationshipDefStore.preDeleteByGuid(relationshipDef.getGuid()));
                } else {
                    preDeleteRelationshipDefs.add(relationshipDefStore.preDeleteByName(relationshipDef.getName()));
                }
            }
        }
        if (CollectionUtils.isNotEmpty(typesDef.getStructDefs())) {
            for (AtlasStructDef structDef : typesDef.getStructDefs()) {
                if (StringUtils.isNotBlank(structDef.getGuid())) {
                    preDeleteStructDefs.add(structDefStore.preDeleteByGuid(structDef.getGuid()));
                } else {
                    preDeleteStructDefs.add(structDefStore.preDeleteByName(structDef.getName()));
                }
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getClassificationDefs())) {
            for (AtlasClassificationDef classifiDef : typesDef.getClassificationDefs()) {
                if (StringUtils.isNotBlank(classifiDef.getGuid())) {
                    preDeleteClassifiDefs.add(classifiDefStore.preDeleteByGuid(classifiDef.getGuid()));
                } else {
                    preDeleteClassifiDefs.add(classifiDefStore.preDeleteByName(classifiDef.getName()));
                }
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getEntityDefs())) {
            for (AtlasEntityDef entityDef : typesDef.getEntityDefs()) {
                if (StringUtils.isNotBlank(entityDef.getGuid())) {
                    preDeleteEntityDefs.add(entityDefStore.preDeleteByGuid(entityDef.getGuid()));
                } else {
                    preDeleteEntityDefs.add(entityDefStore.preDeleteByName(entityDef.getName()));
                }
            }
        }

        // run the actual deletes

        // run the relationshipDef delete first - in case there is a enumDef or entityDef dependancy that is going to be deleted.
        if (CollectionUtils.isNotEmpty(typesDef.getRelationshipDefs())) {
            int i = 0;
            for (AtlasRelationshipDef relationshipDef : typesDef.getRelationshipDefs()) {
                if (StringUtils.isNotBlank(relationshipDef.getGuid())) {
                    relationshipDefStore.deleteByGuid(relationshipDef.getGuid(), preDeleteRelationshipDefs.get(i));
                } else {
                    relationshipDefStore.deleteByName(relationshipDef.getName(), preDeleteRelationshipDefs.get(i));
                }
                i++;
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getStructDefs())) {
            int i = 0;
            for (AtlasStructDef structDef : typesDef.getStructDefs()) {
                if (StringUtils.isNotBlank(structDef.getGuid())) {
                    structDefStore.deleteByGuid(structDef.getGuid(), preDeleteStructDefs.get(i));
                } else {
                    structDefStore.deleteByName(structDef.getName(), preDeleteStructDefs.get(i));
                }
                i++;
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getClassificationDefs())) {
            int i = 0;
            for (AtlasClassificationDef classifiDef : typesDef.getClassificationDefs()) {
                if (StringUtils.isNotBlank(classifiDef.getGuid())) {
                    classifiDefStore.deleteByGuid(classifiDef.getGuid(), preDeleteClassifiDefs.get(i));
                } else {
                    classifiDefStore.deleteByName(classifiDef.getName(), preDeleteClassifiDefs.get(i));
                }
                i++;
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getEntityDefs())) {
            int i = 0;
            for (AtlasEntityDef entityDef : typesDef.getEntityDefs()) {
                if (StringUtils.isNotBlank(entityDef.getGuid())) {
                    entityDefStore.deleteByGuid(entityDef.getGuid(), preDeleteEntityDefs.get(i));
                } else {
                    entityDefStore.deleteByName(entityDef.getName(), preDeleteEntityDefs.get(i));
                }
                i++;
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getEnumDefs())) {
            for (AtlasEnumDef enumDef : typesDef.getEnumDefs()) {
                if (StringUtils.isNotBlank(enumDef.getGuid())) {
                    enumDefStore.deleteByGuid(enumDef.getGuid(), null);
                } else {
                    enumDefStore.deleteByName(enumDef.getName(), null);
                }
            }
        }

        if (CollectionUtils.isNotEmpty(typesDef.getBusinessMetadataDefs())) {
            for (AtlasBusinessMetadataDef businessMetadataDef : typesDef.getBusinessMetadataDefs()) {
                if (StringUtils.isNotBlank(businessMetadataDef.getGuid())) {
                    businessMetadataDefStore.deleteByGuid(businessMetadataDef.getGuid(), null);
                } else {
                    businessMetadataDefStore.deleteByName(businessMetadataDef.getName(), null);
                }
            }
        }

        // Remove all from
        ttr.removeTypesDef(typesDef);

        if (LOG.isDebugEnabled()) {
            LOG.debug("<== AtlasTypeDefGraphStore.deleteTypesDef(enums={}, structs={}, classfications={}, entities={})",
                    CollectionUtils.size(typesDef.getEnumDefs()),
                    CollectionUtils.size(typesDef.getStructDefs()),
                    CollectionUtils.size(typesDef.getClassificationDefs()),
                    CollectionUtils.size(typesDef.getEntityDefs()));
        }
    }
