@Get
    public Representation getConfiguration() throws NotFoundException, ServerException {

        UmaUris umaUris = urisFactory.get(getRequest());
        UmaProviderSettings providerSettings = providerSettingsFactory.get(getRequest());

        JsonValue configuration = json(object(
                field("version", providerSettings.getVersion()),
                field("issuer", umaUris.getIssuer()),
                field("pat_profiles_supported", providerSettings.getSupportedPATProfiles()),
                field("aat_profiles_supported", providerSettings.getSupportedAATProfiles()),
                field("rpt_profiles_supported", providerSettings.getSupportedRPTProfiles()),
                field("pat_grant_types_supported", providerSettings.getSupportedPATGrantTypes()),
                field("aat_grant_types_supported", providerSettings.getSupportedAATGrantTypes()),
                field("token_endpoint", umaUris.getTokenEndpoint()),
                field("authorization_endpoint", umaUris.getAuthorizationEndpoint()),
                field("introspection_endpoint", umaUris.getTokenIntrospectionEndpoint()),
                field("resource_set_registration_endpoint", umaUris.getResourceSetRegistrationEndpoint()),
                field("permission_registration_endpoint", umaUris.getPermissionRegistrationEndpoint()),
                field("rpt_endpoint", umaUris.getRPTEndpoint())));

        Set<String> supportedClaimTokenProfiles = providerSettings.getSupportedClaimTokenProfiles();
        if (supportedClaimTokenProfiles != null && !supportedClaimTokenProfiles.isEmpty()) {
            configuration.add("claim_token_profiles_supported", supportedClaimTokenProfiles);
        }
        Set<URI> supportedUmaProfiles = providerSettings.getSupportedUmaProfiles();
        if (supportedUmaProfiles != null && !supportedUmaProfiles.isEmpty()) {
            configuration.add("uma_profiles_supported", supportedUmaProfiles);
        }
        URI dynamicClientEndpoint = umaUris.getDynamicClientEndpoint();
        if (dynamicClientEndpoint != null) {
            configuration.add("dynamic_client_endpoint", dynamicClientEndpoint);
        }
        URI requestingPartyClaimsEndpoint = umaUris.getRequestingPartyClaimsEndpoint();
        if (requestingPartyClaimsEndpoint != null) {
            configuration.add("requesting_party_claims_endpoint", requestingPartyClaimsEndpoint.toString());
        }

        return jacksonRepresentationFactory.create(configuration.asMap());
    }
