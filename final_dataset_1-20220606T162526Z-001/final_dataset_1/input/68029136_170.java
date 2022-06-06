public void deletePropertyDescriptorByOwnerIncludingPropertyValues(PropertyDescriptorEntity descriptorToDelete, AbstractContext abstractContext, HasContexts attachedResource)
            throws AMWException {
        PropertyDescriptorEntity descriptorToDeleteWithTags = getPropertyDescriptorWithTags(descriptorToDelete.getId());
        Set<PropertyEntity> propertiesToBeDeleted = descriptorToDeleteWithTags.getProperties();
        Set<ContextDependency> resourceContexts = attachedResource.getContexts();
        auditService.storeIdInThreadLocalForAuditLog(attachedResource);
        for (ContextDependency context : resourceContexts) {
            if (context.getProperties().size() > 0) {
                for (PropertyEntity property : propertiesToBeDeleted) {
                    context.removeProperty(property);
                }
            }
            if (context.getPropertyDescriptors().size() > 0) {
                context.removePropertyDescriptor(descriptorToDelete);
            }
        }
        if (attachedResource instanceof ResourceEntity) {
            removeRelationPropertyValues((ResourceEntity) attachedResource, propertiesToBeDeleted);
        } else if (attachedResource instanceof ResourceTypeEntity) {
            removeInstancePropertyValues((ResourceTypeEntity) attachedResource, propertiesToBeDeleted);
            removeRelationPropertyValues((ResourceTypeEntity) attachedResource, propertiesToBeDeleted);
        }
        removePropertyDescriptorByOwner(descriptorToDeleteWithTags, abstractContext, true);
    }
