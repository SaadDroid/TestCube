@Override
    public Promise<ResourceResponse, ResourceException> deleteInstance(Context context, String resourceId,
            DeleteRequest request) {

        //auth
        final Subject callingSubject = getContextSubject(context);

        if (callingSubject == null) {
            debug.error("ApplicationsResource :: DELETE : Unknown Subject");
            return new BadRequestException().asPromise();
        }

        final String realm = getRealm(context);
        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(callingSubject);

        try {
            Application oldApp = appManager.getApplication(callingSubject, realm, resourceId);

            if (oldApp == null) {
                throw new EntitlementException(EntitlementException.NO_SUCH_APPLICATION,
                                new String[] { resourceId });
            }

            appManager.deleteApplication(callingSubject, realm, resourceId);

            ResourceResponse resource = newResourceResponse(resourceId, "0", JsonValue.json(JsonValue.object()));
            return newResultPromise(resource);
        } catch (EntitlementException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationsResource :: DELETE by " + principalName +
                        ": Application failed to delete the resource specified. ", e);
            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
