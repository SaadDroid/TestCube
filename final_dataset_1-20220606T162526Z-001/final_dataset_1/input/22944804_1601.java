@Override
    public Promise<AuthorizationResult, ResourceException> authorizeAction(Context context, ActionRequest request) {

        if (actionCanBeInvokedByNonAdmin(request.getAction())) {
            return Promises.newResultPromise(AuthorizationResult.accessPermitted());
        }

        return super.authorizeAction(context, request);
    }
