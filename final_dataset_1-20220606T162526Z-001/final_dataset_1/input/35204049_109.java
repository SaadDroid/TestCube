@Override
    public AtlasTypesDef searchTypesDef(SearchFilter searchFilter) throws AtlasBaseException {
        final AtlasTypesDef typesDef = new AtlasTypesDef();
        Predicate searchPredicates = FilterUtil.getPredicateFromSearchFilter(searchFilter);

        for(AtlasEnumType enumType : typeRegistry.getAllEnumTypes()) {
            if (searchPredicates.evaluate(enumType)) {
                typesDef.getEnumDefs().add(enumType.getEnumDef());
            }
        }

        for(AtlasStructType structType : typeRegistry.getAllStructTypes()) {
            if (searchPredicates.evaluate(structType)) {
                typesDef.getStructDefs().add(structType.getStructDef());
            }
        }

        for(AtlasClassificationType classificationType : typeRegistry.getAllClassificationTypes()) {
            if (searchPredicates.evaluate(classificationType)) {
                typesDef.getClassificationDefs().add(classificationType.getClassificationDef());
            }
        }

        for(AtlasEntityType entityType : typeRegistry.getAllEntityTypes()) {
            if (searchPredicates.evaluate(entityType)) {
                typesDef.getEntityDefs().add(entityType.getEntityDef());
            }
        }

        for(AtlasRelationshipType relationshipType : typeRegistry.getAllRelationshipTypes()) {
            if (searchPredicates.evaluate(relationshipType)) {
                typesDef.getRelationshipDefs().add(relationshipType.getRelationshipDef());
            }
        }

        return typesDef;
    }
