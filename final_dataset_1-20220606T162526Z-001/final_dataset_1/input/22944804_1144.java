@Override
    public Promise<ResourceResponse, ResourceException> createInstance(Context context, CreateRequest request) {
        String providedName = null;
        try {
            providedName = request.getNewResourceId();

            Privilege policy = policyParser.parsePolicy(providedName, request.getContent());

            if (isNotBlank(providedName) && !providedName.equals(policy.getName())) {
                DEBUG.error("PolicyResource :: CREATE : Resource name and JSON body name do not match.");
                throw new EntitlementException(EntitlementException.POLICY_NAME_MISMATCH);
            }

            if (isBlank(providedName)) {
                providedName = policy.getName();
            }

            // OPENAM-5031
            // This is a bad solution and should be rewritten when we have time.  This code rejects anything in the
            // name that when encoded differs from the original.  So, for instance "+" becomes "\+".
            // What we should do is to encode the name for storage purposes, and decode it before presentation to the
            // user.
            if (!providedName.equals(DN.escapeAttributeValue(providedName))) {
                throw new EntitlementException(EntitlementException.INVALID_VALUE,
                        new Object[]{"policy name \"" + providedName + "\""});
            }

            policyStoreProvider.getPolicyStore(context).create(policy);
            return newResultPromise(policyResource(policy));
        } catch (EntitlementException ex) {
            DEBUG.error("PolicyResource :: CREATE : Error performing create for policy, " + providedName, ex);
            return resourceErrorHandler.handleError(context, request, ex).asPromise();
        }
    }
