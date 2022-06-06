@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context context, QueryRequest request,
            QueryResourceHandler handler) {

        //auth
        final Subject mySubject = getContextSubject(context);

        if (mySubject == null) {
            debug.error("ApplicationsResource :: UPDATE : Unknown Subject");
            return new BadRequestException().asPromise();
        }

        //select
        final String realm = getRealm(context);
        final String principalName = PrincipalRestUtils.getPrincipalNameFromSubject(mySubject);

        try {
            List<ResourceResponse> results = new ArrayList<>();
            final Set<String> appNames = query(request, mySubject, realm);
            for (String appName : appNames) {
                final Application application = appManager.getApplication(mySubject, realm, appName);

                if (application == null) {
                    debug.warning("Unable to find application " + appName);
                    continue;
                }

                ApplicationWrapper wrapper = createApplicationWrapper(application, appTypeManagerWrapper);
                results.add(newResourceResponse(wrapper.getName(), null, wrapper.toJsonValue()));
            }

            QueryResponsePresentation.enableDeprecatedRemainingQueryResponse(request);
            return QueryResponsePresentation.perform(handler, request, results);
        } catch (EntitlementException e) {
            if (debug.errorEnabled()) {
                debug.error("ApplicationsResource :: QUERY by " + principalName +
                        ": Failed to query resource.", e);

            }
            return exceptionMappingHandler.handleError(context, request, e).asPromise();
        }
    }
