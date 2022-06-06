@Override
    public Promise<ResourceResponse, ResourceException> updateInstance(Context context, String resourceId,
            UpdateRequest request) {

        final Subject mySubject = getContextSubject(context);

        if (mySubject == null) {
            debug.error("ApplicationsResource :: UPDATE : Unknown Subject");
            return new BadRequestException().asPromise();
        }

        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(mySubject);

        final ApplicationWrapper wrapp;
        final Application oldApplication;

        try {
            wrapp = createApplicationWrapper(request.getContent(), mySubject);

            if (wrapp.getName() == null) {
                wrapp.setName(resourceId);
            }

            oldApplication = appManager.getApplication(mySubject, getRealm(context), resourceId);

            if (oldApplication == null) {
                throw new EntitlementException(EntitlementException.NOT_FOUND, new String[] { resourceId });
            }

            if (!resourceId.equals(wrapp.getName()) && //return conflict
                    appManager.getApplication(mySubject, getRealm(context), wrapp.getName()) != null) {
                throw new EntitlementException(EntitlementException.APPLICATION_ALREADY_EXISTS);
            }

            appManager.updateApplication(oldApplication, wrapp.getApplication(), mySubject, getRealm(context));

            ResourceResponse resource = newResourceResponse(wrapp.getName(),
                    Long.toString(wrapp.getApplication().getLastModifiedDate()), wrapp.toJsonValue());

            return newResultPromise(resource);

        } catch (EntitlementException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationsResource :: UPDATE by " + principalName +
                        ": Error performing update operation.", e);
            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
