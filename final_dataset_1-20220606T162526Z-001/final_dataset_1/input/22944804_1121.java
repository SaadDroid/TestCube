@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context context, QueryRequest request,
            QueryResourceHandler handler) {
        String principalName = "unknown";
        String realm = getRealm(context);
        QueryFilter<JsonPointer> queryFilter = request.getQueryFilter();

        try {
            Subject subject = getSubject(context);
            principalName = PrincipalRestUtils.getPrincipalNameFromSubject(subject);
            Map<String, Map<String, Set<String>>> configData = resourceTypeService.getResourceTypesData(subject, realm);

            Set<String> filterResults;
            if (queryFilter == null) {
                filterResults = configData.keySet();
            } else {
                filterResults = queryFilter.accept(new DataQueryFilterVisitor(), configData);
            }

            List<ResourceResponse> results = new ArrayList<>();
            for (String uuid : filterResults) {
                ResourceType resourceType = resourceTypeService.getResourceType(subject, realm, uuid);
                results.add(newResourceResponse(resourceType.getUUID(), null,
                        new JsonResourceType(resourceType).toJsonValue()));
            }

            QueryResponsePresentation.enableDeprecatedRemainingQueryResponse(request);
            return QueryResponsePresentation.perform(handler, request, results);

        } catch (EntitlementException ee) {
            if (logger.errorEnabled()) {
                logger.error("ResourceTypesResource :: QUERY by " + principalName
                        + ": Caused EntitlementException: ", ee);
            }
            return exceptionMappingHandler.handleError(context, request, ee).asPromise();
        } catch (QueryException e) {
            return new BadRequestException(e.getL10NMessage(ServerContextUtils.getLocaleFromContext(context)))
                    .asPromise();
        }
    }
