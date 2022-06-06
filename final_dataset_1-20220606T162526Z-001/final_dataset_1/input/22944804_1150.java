@Override
    public Promise<ResourceResponse, ResourceException> updateInstance(Context context, String resourceId,
            UpdateRequest request) {
        try {
            Privilege policy = policyParser.parsePolicy(resourceId, request.getContent());
            ResourceResponse result = policyResource(policyStoreProvider.getPolicyStore(context).update(resourceId, policy));
            return newResultPromise(result);
        } catch (EntitlementException ex) {
            DEBUG.error("PolicyResource :: UPDATE : Error updating policy, " + resourceId + ".", ex);
            return resourceErrorHandler.handleError(context, request, ex).asPromise();
        }
    }
