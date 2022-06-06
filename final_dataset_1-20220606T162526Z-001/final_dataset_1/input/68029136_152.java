public PropertyDescriptorEntity savePropertyDescriptorForResource(ForeignableOwner editingOwner, Integer resourceId, PropertyDescriptorEntity descriptor, int foreignableHashBeforeModification, String propertyTagsString) throws AMWException, ForeignableOwnerViolationException {
        ResourceEntity attachedResource = entityManager.find(ResourceEntity.class, resourceId);
        // verify if modifications are allowed
        permissionBoundary.checkPermissionAndFireException(Permission.RESOURCE, null, Action.UPDATE, attachedResource.getResourceGroup(), null, null);
        foreignableService.verifyEditableByOwner(editingOwner, foreignableHashBeforeModification, descriptor);
        return savePropertyDescriptorResource(editingOwner, resourceId, descriptor, propertyTagsString);
    }
