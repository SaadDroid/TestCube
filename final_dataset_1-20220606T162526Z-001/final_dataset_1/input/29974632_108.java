private void applyPolicy(final String policy, final SavedSnapshot snapshot)
        throws ControlPointApiException
    {
        final TypedStateToken stateToken = snapshot.getStateTokens().stream()
            .filter(x -> x.getType().equals(TypedStateToken.StateTokenType.QUERY))
            .findFirst()
            .orElseThrow(() ->
                new RuntimeException("Saved Snapshot has no associated state token"));

        // get the ACI parameter handler to determine security info for us
        final AciParameters aciParams = new AciParameters();
        aciParameterHandler.addSecurityInfo(aciParams);
        final String securityInfo = aciParams.get(QueryParams.SecurityInfo.name());

        controlPointService.applyPolicy(policy, stateToken.getStateToken(), securityInfo);
    }
