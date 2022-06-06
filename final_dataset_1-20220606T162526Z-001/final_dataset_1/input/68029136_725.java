public void saveFunction(AmwFunctionEntity amwFunction) throws AMWException {
        if (amwFunction.getResource() == null && amwFunction.getResourceType() != null) {
            permissionBoundary.checkPermissionAndFireException(Permission.RESOURCETYPE_AMWFUNCTION, null, Action.UPDATE,
                    null, amwFunction.getResourceType(), "missing Permission to save ResourceType functions");
        } else {
            permissionBoundary.checkPermissionAndFireException(Permission.RESOURCE_AMWFUNCTION, null, Action.UPDATE,
                    amwFunction.getResource().getResourceGroup(), null,
                    "missing Permission to save Resource functions");
        }

        freemarkerValidator.validateFreemarkerSyntax(amwFunction.getDecoratedImplementation());
        functionRepository.persistOrMergeFunction(amwFunction);
    }
