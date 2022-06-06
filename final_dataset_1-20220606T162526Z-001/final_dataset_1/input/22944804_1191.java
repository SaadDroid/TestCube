@Override
    public Promise<ResourceResponse, ResourceException> readInstance(Context context, String resourceId,
            ReadRequest request) {

        final Subject mySubject = getContextSubject(context);

        if (mySubject == null) {
            debug.error("ApplicationsResource :: READ : Unknown Subject");
            return new BadRequestException().asPromise();
        }

        final String realm = getRealm(context);
        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(mySubject);

        try {
            final Application app = appManager.getApplication(mySubject, realm, resourceId);

            if (app == null) {
                throw new EntitlementException(EntitlementException.APP_RETRIEVAL_ERROR, new String[] { realm });
            }

            final ApplicationWrapper wrapp = createApplicationWrapper(app, appTypeManagerWrapper);

            ResourceResponse resource = newResourceResponse(resourceId, Long.toString(app.getLastModifiedDate()),
                    wrapp.toJsonValue());
            return newResultPromise(resource);
        } catch (EntitlementException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationsResource :: READ by " + principalName +
                        ": Application failed to retrieve the resource specified.", e);
            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
