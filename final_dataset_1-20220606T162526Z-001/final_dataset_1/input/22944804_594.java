@Post
    public Representation registerPermissionRequest(JsonRepresentation entity) throws UmaException, NotFoundException,
            ServerException {
        JsonValue permissionRequest = json(toMap(entity));
        String resourceSetId = getResourceSetId(permissionRequest);
        OAuth2Request oAuth2Request = requestFactory.create(getRequest());
        String clientId = getClientId(oAuth2Request);
        OAuth2ProviderSettings providerSettings = providerSettingsFactory.get(oAuth2Request);
        String resourceOwnerId = getResourceOwnerId(oAuth2Request);
        ResourceSetDescription resourceSetDescription = getResourceSet(resourceSetId, resourceOwnerId,
                providerSettings);
        Set<String> scopes = validateScopes(permissionRequest, resourceSetDescription);
        for (PermissionRequestFilter filter : extensionFilterManager.getFilters(PermissionRequestFilter.class)) {
            filter.onPermissionRequest(resourceSetDescription, scopes, clientId);
        }
        String ticket = umaProviderSettingsFactory.get(getRequest()).getUmaTokenStore()
                .createPermissionTicket(resourceSetId, scopes, clientId).getId();
        return setResponse(201, Collections.<String, Object>singletonMap("ticket", ticket));
    }
