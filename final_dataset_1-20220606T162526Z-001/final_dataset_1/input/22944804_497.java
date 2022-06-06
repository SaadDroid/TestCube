@Override
    public Promise<UmaPolicy, ResourceException> createPolicy(final Context context, JsonValue policy) {
        final UmaPolicy umaPolicy;
        final ResourceSetDescription resourceSet;
        final String userId = contextHelper.getUserId(context);
        String realm = getRealm(context);
        try {
            String policyId = UmaPolicy.idOf(policy);
            resourceSet = getResourceSet(realm, policyId);
            umaPolicy = UmaPolicy.valueOf(resourceSet, resolveUsernameToUID(context, policy));
            boolean canShare = canUserShareResourceSet(resourceSet.getResourceOwnerId(),
                    userId, resourceSet.getClientId(), realm, resourceSet.getId(),
                    umaPolicy.getScopes());
            if (!canShare) {
                return new ForbiddenException().asPromise();
            }
            validateScopes(resourceSet, umaPolicy.getScopes());
            verifyPolicyDoesNotAlreadyExist(context, resourceSet);
        } catch (ResourceException e) {
            return e.asPromise();
        }
        return beforeResourceShared(umaPolicy)
                .thenAsync(new AsyncFunction<UmaPolicy, List<ResourceResponse>, ResourceException>() {
                    @Override
                    public Promise<List<ResourceResponse>, ResourceException> apply(UmaPolicy umaPolicy) {
                        return policyResourceDelegate.createPolicies(context, umaPolicy.asUnderlyingPolicies(userId));
                    }
                })
                .thenAlways(afterResourceShared(umaPolicy))
                .thenAsync(new UpdatePolicyGraphStatesFunction<List<ResourceResponse>>(resourceSet, context))
                .thenAsync(new AuditAndProduceUmaPolicyFunction(resourceSet, context));
    }
