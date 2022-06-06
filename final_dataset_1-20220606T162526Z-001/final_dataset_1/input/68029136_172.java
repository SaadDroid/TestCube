public PropertyDescriptorEntity savePropertyDescriptorForOwner(ForeignableOwner changingOwner, AbstractContext abstractContext, PropertyDescriptorEntity descriptor, List<PropertyTagEntity> tags, ResourceEntity resource) throws AMWException {
        checkForValidTechnicalKey(descriptor);
        auditService.storeIdInThreadLocalForAuditLog(resource);
        if (descriptor.getId() == null) {
            preventDuplicateTechnicalKeys(abstractContext, descriptor);
            createNewPropertyDescriptor(changingOwner, descriptor, abstractContext, tags);
        } else {
            saveExistingPropertyDescriptor(descriptor, tags, resource);
        }

        return descriptor;
    }
