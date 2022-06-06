@Override
    public ConditionDecision evaluate(String realm, Subject subject, String resourceName, Map<String, Set<String>> env)
            throws EntitlementException {
        if (debug.messageEnabled()) {
            debug.message("Entering OAuth2ScopeCondition.getConditionDecision(). Required scopes=" + requiredScopes
                    + ". Request scopes=" + (env == null ? "<missing>" : env.get(REQUEST_SCOPE_ATTRIBUTE)));
        }

        Set<String> scopeParams = (env == null ? null : env.get(REQUEST_SCOPE_ATTRIBUTE));
        String scopes = "";
        if (scopeParams != null && !scopeParams.isEmpty()) {
            scopes = scopeParams.iterator().next();
        }

        boolean allowed = false;

        try {
            Set<String> requestScopes = toScopeSet(scopes);
            allowed = requestScopes.containsAll(requiredScopes);
        } catch (EntitlementException e) {
            if (debug.messageEnabled()) {
                debug.message("Invalid scope in request: " + e.getMessage(), e);
            }
        }

        if (debug.messageEnabled()) {
            debug.message("OAuth2ScopeCondition decision: " + allowed);
        }

        // TODO: Do we need policy advice for OAuth2 scopes?
        return new ConditionDecision(allowed, Collections.<String, Set<String>>emptyMap());
    }
