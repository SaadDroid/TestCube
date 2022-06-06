public AmwFunctionEntity overwriteResourceTypeFunction(String functionBody, Integer resourceTypeId, Integer functionToOverwriteId) throws AMWException {
        AmwFunctionEntity functionToOverwrite = functionRepository.getFunctionByIdWithChildFunctions(functionToOverwriteId);
        ResourceTypeEntity resourceType = resourceTypeRepository.find(resourceTypeId);
        if (functionToOverwrite == null || resourceType == null) {
            throw new NotFoundException("Function or ResourceType not found");
        }
        permissionBoundary.checkPermissionAndFireException(Permission.RESOURCETYPE_AMWFUNCTION, null, Action.UPDATE,
                null, resourceType, "missing Permission to overwrite ResourceType functions");

        AmwFunctionEntity overwritingFunction = functionService.overwriteResourceTypeFunction(functionBody, functionToOverwrite, resourceType);
        freemarkerValidator.validateFreemarkerSyntax(overwritingFunction.getDecoratedImplementation());
        return overwritingFunction;
    }
