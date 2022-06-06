@HasPermission(permission = Permission.SHAKEDOWN_TEST_MODE)
    public PropertyDescriptorEntity saveTestingPropertyDescriptorForResourceType(Integer resourceTypeId, PropertyDescriptorEntity descriptor, int foreignableHashBeforeModification, String propertyTagsString) throws AMWException, ForeignableOwnerViolationException {

        // verify if modifications are allowed
        foreignableService.verifyEditableByOwner(ForeignableOwner.getSystemOwner(), foreignableHashBeforeModification, descriptor);
        return savePropertyDescriptorResourceType(ForeignableOwner.getSystemOwner(), resourceTypeId, descriptor, propertyTagsString);
    }
