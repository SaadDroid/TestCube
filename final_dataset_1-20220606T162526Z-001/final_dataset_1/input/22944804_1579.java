public Promise<ActionResponse, ResourceException> actionInstance(Context context, String tokenId,
            ActionRequest request) {
        return internalHandleAction(tokenId, context, request);
    }
