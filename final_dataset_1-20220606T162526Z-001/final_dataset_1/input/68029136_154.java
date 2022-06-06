@HasPermission(permission = Permission.SHAKEDOWN_TEST_MODE)
    public PropertyDescriptorEntity saveTestingPropertyDescriptorForResource(Integer resourceId, PropertyDescriptorEntity descriptor,int foreignableHashBeforeModification, String propertyTagsString) throws AMWException, ForeignableOwnerViolationException {
        // verify if modifications are allowed
        foreignableService.verifyEditableByOwner(ForeignableOwner.getSystemOwner(), foreignableHashBeforeModification, descriptor);
        return savePropertyDescriptorResource(ForeignableOwner.getSystemOwner(), resourceId, descriptor, propertyTagsString);
    }
