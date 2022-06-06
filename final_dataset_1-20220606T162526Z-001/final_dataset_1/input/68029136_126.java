public void setPropertyValueOnResourceForContext(String resourceGroupName, String releaseName,
            String contextName, String propertyName, String propertyValue) throws ValidationException {
        ValidationHelper
                .validateNotNullOrEmptyChecked(resourceGroupName, releaseName, propertyValue, propertyName);

        ResourceEntity resourceByNameAndRelease = resourceLocator.getResourceByGroupNameAndRelease(
                resourceGroupName, releaseName);

        if (resourceByNameAndRelease == null) {
            log.info("Resource group " + resourceGroupName + " not found in release " + releaseName);
            throw new NoResultException("Could not find resource group in this release");
        }

        ContextEntity context = contextLocator.getContextByName(contextName == null ? ContextNames.GLOBAL
                .getDisplayName() : contextName);

        List<ResourceEditProperty> resourceEditProperties = propertyEditingService
                .loadPropertiesForEditResource(resourceByNameAndRelease.getId(),
                        resourceByNameAndRelease.getResourceType(), context);

        ResourceEditProperty property = findByName(propertyName, resourceEditProperties);
        property.setPropertyValue(propertyValue);
        setSingleProperty(resourceByNameAndRelease, context, property.getDescriptorId(), property.getUnobfuscatedValue());
    }
