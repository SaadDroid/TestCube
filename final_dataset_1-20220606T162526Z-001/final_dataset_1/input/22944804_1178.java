@Override
    public Promise<ResourceResponse, ResourceException> readInstance(Context context, String resourceId,
            ReadRequest request) {

        //auth
        final Subject mySubject = getContextSubject(context);

        if (mySubject == null) {
            debug.error("ApplicationsTypesResource :: READ : Unknown Subject");
            return new InternalServerErrorException().asPromise();
        }

        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(mySubject);

        final ApplicationType applType = typeManager.getApplicationType(mySubject, resourceId);
        final ApplicationTypeWrapper wrap = new ApplicationTypeWrapper(applType);

        if (applType == null) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationTypesResource :: READ by " + principalName +
                        ": Requested application type short name not found: " + resourceId);
            }
            return new NotFoundException().asPromise();
        }

        try {
            final ResourceResponse resource = newResourceResponse(resourceId,
                    String.valueOf(System.currentTimeMillis()), JsonValue.json(wrap.toJsonValue()));
            return newResultPromise(resource);
        } catch (IOException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationTypesResource :: READ by " + principalName +
                        ": Could not jsonify class associated with defined Type: " + resourceId, e);
            }
            return new InternalServerErrorException().asPromise();
        }
    }
