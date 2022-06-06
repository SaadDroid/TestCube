@Override
    public Promise<ResourceResponse, ResourceException> filterUpdate(final Context context,
            final UpdateRequest request, final RequestHandler next) {

        final JsonValue jsonValue = request.getContent();
        final Map<String, Boolean> actions = jsonValue.get(ACTIONS).asMap(Boolean.class);
        final Set<String> resources = jsonValue.get(RESOURCES).asSet(String.class);
        final String bodyRealm = jsonValue.get(REALM).asString();
        final String pathRealm = contextHelper.getRealm(context);

        if (actions == null) {
            return new BadRequestException("Invalid actions defined in request").asPromise();
        }

        if (resources == null) {
            return new BadRequestException("Invalid resources defined in request").asPromise();
        }

        if (!pathRealm.equals(bodyRealm)) {
            return resourceErrorHandler.handleError(context, request, new EntitlementException
                    (EntitlementException.INVALID_APP_REALM, new String[]{bodyRealm, pathRealm})).asPromise();
        }

        final Subject callingSubject = contextHelper.getSubject(context);
        final String applicationName = request.getResourcePath();

        try {
            final ApplicationService applicationService = applicationServiceFactory.create(callingSubject, pathRealm);
            final Application application = applicationService.getApplication(applicationName);

            if (application == null) {
                return new NotFoundException("Unable to find application " + applicationName).asPromise();
            }

            if (application.getResourceTypeUuids().size() != 1) {
                return new BadRequestException("Cannot modify application with more than one "
                        + "resource type using version 1.0 of this endpoint").asPromise();
            }

            // Retrieve the resource type from the applications single resource type.
            final String resourceTypeUuid = application.getResourceTypeUuids().iterator().next();
            ResourceType resourceType = resourceTypeService.getResourceType(callingSubject, pathRealm, resourceTypeUuid);

            boolean resourceTypeModified = false;

            if (!actions.equals(resourceType.getActions())) {
                resourceTypeModified = true;
                resourceType = resourceType
                        .populatedBuilder()
                        .setActions(actions)
                        .build();
            }

            if (!resources.equals(resourceType.getPatterns())) {
                resourceTypeModified = true;
                resourceType = resourceType
                        .populatedBuilder()
                        .setPatterns(resources)
                        .build();
            }

            if (resourceTypeModified) {
                resourceTypeService.updateResourceType(callingSubject, pathRealm, resourceType);
            }

            // Ensure the resource type UUID isn't lost.
            jsonValue.put(RESOURCE_TYPE_UUIDS, new HashSet<String>(Arrays.asList(resourceTypeUuid)));

        } catch (EntitlementException eE) {
            debug.error("Error filtering application update CREST request", eE);
            return resourceErrorHandler.handleError(context, request, eE).asPromise();
        }

        // Forward onto next handler.
        return applicationTransformer.transform(next.handleUpdate(context, request), context);
    }
