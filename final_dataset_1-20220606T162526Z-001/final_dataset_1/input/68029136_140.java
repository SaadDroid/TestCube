public void resetPropertyValueOnResourceRelationForContext(String resourceGroupName,
            String resourceReleaseName, String relatedResourceGroupName,
            String relatedResourceReleaseName, String contextName, String propertyName)
            throws IllegalArgumentException, EJBException, IllegalStateException, NotAuthorizedException,
            ValidationException {
        ValidationHelper.validateNotNullOrEmptyChecked(resourceGroupName, resourceReleaseName, relatedResourceGroupName, relatedResourceReleaseName, propertyName);

        ConsumedResourceRelationEntity resourceRelation = resourceRelationLocator.getResourceRelation(resourceGroupName, resourceReleaseName, relatedResourceGroupName, relatedResourceReleaseName);
        ContextEntity context = contextLocator.getContextByName(contextName == null ? ContextNames.GLOBAL.getDisplayName() : contextName);

        ResourceRelationContextEntity resourceRelationContext = resourceRelationContextRepository.getResourceRelationContext(resourceRelation, context);
        PropertyDescriptorEntity propertyDescriptor = getMatchingPropertyDescriptorEntity(propertyName, resourceRelationContext);

        if (propertyDescriptor == null) {
            throw new IllegalArgumentException("Property value for property with name '" + propertyName + "' was not found on env " + context.getName());
        }
        resetSingleProperty(resourceRelation, context, propertyDescriptor.getId());
    }
