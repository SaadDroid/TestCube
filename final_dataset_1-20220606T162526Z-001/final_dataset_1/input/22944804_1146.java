@Override
    public Promise<ResourceResponse, ResourceException> deleteInstance(Context context, String resourceId,
            DeleteRequest request) {
        try {
            PolicyStore store = policyStoreProvider.getPolicyStore(context);
            store.delete(resourceId);
            if (DEBUG.messageEnabled()) {
                DEBUG.message("PolicyResource :: DELETE : Deleted policy with ID, " + resourceId);
            }
            // Return an empty resource to indicate success?
            return newResultPromise(newResourceResponse(resourceId, "0", json(object())));
        } catch (EntitlementException ex) {
            String debug = "PolicyResource :: DELETE : Error performing delete for policy, " + resourceId;
            return resourceErrorHandler.handleError(context, debug, request, ex).asPromise();
        }
    }
