@Override
    public Promise<ResourceResponse, ResourceException> updateInstance(Context context, String resourceId,
            UpdateRequest request) {

        String principalName = "unknown";
        try {
            final Subject subject = getSubject(context);
            principalName = PrincipalRestUtils.getPrincipalNameFromSubject(subject);
            final JsonResourceType jsonWrapper = createJsonResourceType(request.getContent());

            if (StringUtils.isEmpty(jsonWrapper.getName())) {
                throw new EntitlementException(MISSING_RESOURCE_TYPE_NAME);
            }

            ResourceType resourceTypeToUpdate = jsonWrapper.getResourceType(false);
            if (!StringUtils.isEqualTo(resourceId, resourceTypeToUpdate.getUUID())) {
                throw new EntitlementException(RESOURCE_TYPE_ID_MISMATCH);
            }
            final ResourceType updatedResourceType = resourceTypeService.updateResourceType(subject, getRealm(context),
                    resourceTypeToUpdate);

            if (logger.messageEnabled()) {
                logger.message("ResourceTypeResource :: UPDATE by "
                        + principalName
                        + ": for Resource Type: "
                        + jsonWrapper.getName());
            }

            return newResultPromise(newResourceResponse(updatedResourceType.getUUID(), null,
                    new JsonResourceType(updatedResourceType).toJsonValue()));

        } catch (EntitlementException e) {
            if (logger.errorEnabled()) {
                logger.error("ResourceTypeResource :: UPDATE by "
                             + principalName
                             + ": Resource Type update failed. ", e);
            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
