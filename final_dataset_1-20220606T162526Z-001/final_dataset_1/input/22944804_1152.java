@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context context, QueryRequest request,
            QueryResourceHandler handler) {
        try {
            List<ResourceResponse> results = new ArrayList<>();
            for (Privilege policy: policyStoreProvider.getPolicyStore(context).query(request)) {
                results.add(policyResource(policy));
            }

            QueryResponsePresentation.enableDeprecatedRemainingQueryResponse(request);
            return QueryResponsePresentation.perform(handler, request, results);
        } catch (EntitlementException ex) {
            DEBUG.error("PolicyResource :: QUERY : Error querying policy collection.", ex);
            return resourceErrorHandler.handleError(context, request, ex).asPromise();
        } catch (IllegalArgumentException ex) {
            DEBUG.error("PolicyResource :: QUERY : Error querying policy collection due to bad request.", ex);
            return new BadRequestException(ex.getMessage()).asPromise();
        }
    }
