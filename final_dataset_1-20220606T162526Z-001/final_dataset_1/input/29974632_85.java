public void applyPolicy(
        final String policy,
        final String documentsStateToken,
        final String documentsSecurityInfo
    ) throws ControlPointApiException {
        checkEnabled();

        final ControlPointApplyPolicyResponse response =
            apiClient.postUrlencoded("policyfiles/bystoredstate",
                Arrays.asList(
                    new BasicNameValuePair("api-version", "1.0"),
                    new BasicNameValuePair("policyId", policy),
                    new BasicNameValuePair("stateMatchId", documentsStateToken),
                    new BasicNameValuePair("securityInfo", documentsSecurityInfo)
                ),
                Collections.emptyList(),
                ControlPointApplyPolicyResponse.class);

        if (!response.isSuccess()) {
            throw new ControlPointApiException("Failed to apply policy");
        }
        if (response.isPartialApplication()) {
            throw new ControlPointApiException("Policy was partially applied");
        }
    }
