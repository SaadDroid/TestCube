@Override
    public Promise<AuthorizationResult, ResourceException> authorizeQuery(Context context, QueryRequest queryRequest) {
        return new ForbiddenException().asPromise();
    }
