public AmwFunctionEntity createNewResourceTypeFunction(AmwFunctionEntity amwFunction, Integer resourceTypeId,
                                                           Set<String> functionMikNames) throws ValidationException, AMWException {
        ResourceTypeEntity resourceType = resourceTypeRepository.find(resourceTypeId);
        permissionBoundary.checkPermissionAndFireException(Permission.RESOURCETYPE_AMWFUNCTION, null, Action.CREATE,
                null, resourceType, "missing Permission to create ResourceType functions");

        // search for already existing functions with this name on functiontree
        List<AmwFunctionEntity> allFunctionsWithName = functionService.findFunctionsByNameInNamespace(resourceType, amwFunction.getName());
        if (allFunctionsWithName.isEmpty()) {
            amwFunction.setResourceType(resourceType);
            freemarkerValidator.validateFreemarkerSyntax(amwFunction.getDecoratedImplementation());
            functionService.saveFunctionWithMiks(amwFunction, functionMikNames);
        } else {
            throw new ValidationException("Function name already in use", allFunctionsWithName.get(0));
        }
        return amwFunction;
    }
