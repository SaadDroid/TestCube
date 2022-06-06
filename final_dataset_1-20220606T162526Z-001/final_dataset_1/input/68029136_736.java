public List<AmwFunctionEntity> getAllOverwritableSupertypeFunctions(ResourceEntity resourceEntity) {
        Map<String, AmwFunctionEntity> allSuperTypeFunctions = getAllTypeAndSuperTypeFunctions(resourceEntity.getResourceType());

        for(AmwFunctionEntity overwrittenFunction : resourceEntity.getFunctions()){
            if (allSuperTypeFunctions.containsKey(overwrittenFunction.getName())){
                allSuperTypeFunctions.remove(overwrittenFunction.getName());
            }
        }

        return new ArrayList<>(allSuperTypeFunctions.values());
    }
