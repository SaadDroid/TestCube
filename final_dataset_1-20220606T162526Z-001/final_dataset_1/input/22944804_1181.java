@Override
    public Promise<ResourceResponse, ResourceException> createInstance(Context context, CreateRequest request) {

        //auth
        final Subject callingSubject = getContextSubject(context);

        if (callingSubject == null) {
            debug.error("ApplicationsResource :: CREATE : Unknown Subject");
            return new BadRequestException().asPromise();
        }

        final String realm = getRealm(context);

        //select
        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(callingSubject);
        final JsonValue creationRequest = request.getContent();

        final ApplicationWrapper wrapp;
        final Application previousApp;

        try {
            wrapp = createApplicationWrapper(creationRequest, callingSubject);
            String wrappName = wrapp.getName();
            String newResourceId = request.getNewResourceId();

            if (wrappName != null && newResourceId != null) {
                if (!wrappName.equals(newResourceId)) {
                    debug.error("ApplicationsResource :: CREATE : Resource name and JSON body name do not match.");
                    throw new EntitlementException(EntitlementException.APPLICATION_NAME_MISMATCH);
                }
            }

            // OPENAM-5031
            // This is a bad solution and should be rewritten when we have time.  This code rejects anything in the
            // name that when encoded differs from the original.  So, for instance "+" becomes "\+".
            // What we should do is to encode the name for storage purposes, and decode it before presentation to the
            // user.
            if (wrappName == null) {
                wrapp.setName(newResourceId);
            }
            String appName = wrapp.getApplication().getName();
            if (!appName.equals(DN.escapeAttributeValue(appName))) {
                throw new EntitlementException(EntitlementException.INVALID_VALUE,
                        new Object[]{"policy name \"" + appName + "\""});
            }

            previousApp = appManager.getApplication(callingSubject, realm, appName);

            if (previousApp != null) { //return conflict
                throw new EntitlementException(EntitlementException.APPLICATION_ALREADY_EXISTS);
            }

            appManager.saveApplication(callingSubject, realm, wrapp.getApplication());
            Application savedApp = appManager.getApplication(callingSubject, realm, appName);
            ApplicationWrapper savedAppWrapper = createApplicationWrapper(savedApp, appTypeManagerWrapper);

            ResourceResponse resource = newResourceResponse(savedAppWrapper.getName(),
                    Long.toString(savedAppWrapper.getLastModifiedDate()), savedAppWrapper.toJsonValue());
            if (debug.messageEnabled()) {
                debug.message("ApplicationsResource :: CREATE by " + principalName +
                        ": for Application: " + wrapp.getName());
            }
            return newResultPromise(resource);
        } catch (EntitlementException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationsResource :: CREATE by " + principalName +
                        ": Application creation failed. ", e);
            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
