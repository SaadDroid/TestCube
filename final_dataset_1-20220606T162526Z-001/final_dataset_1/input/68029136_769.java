public List<AmwFunctionEntity> findFunctionsByNameInNamespace(Identifiable resourceOrType, String name) {

        List<AmwFunctionEntity> allFunctions = new ArrayList<>();

        if (resourceOrType instanceof ResourceEntity) {
            allFunctions.addAll(findAllResourceFunctionsByName((ResourceEntity) resourceOrType, name));
        }
        if (resourceOrType instanceof ResourceTypeEntity) {
            ResourceTypeEntity resourceType = (ResourceTypeEntity) resourceOrType;
            allFunctions.addAll(findFirstFunctionDefinedOnTypeAndSuperResourceTypesWithName(resourceType.getParentResourceType(), name));
            allFunctions.addAll(findAllFunctionsDefinedOnResourceTypeWithName(resourceType, name));
            allFunctions.addAll(findFirstFunctionDefinedOnSubResourceTypesOrResourcesWithName(resourceType, name));
        }

        return allFunctions;
    }
