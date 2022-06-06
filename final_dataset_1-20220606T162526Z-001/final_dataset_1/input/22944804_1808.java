@Override
    protected AccessToken handle(OAuth2Request request, ClientRegistration clientRegistration,
            OAuth2ProviderSettings providerSettings) throws RedirectUriMismatchException, InvalidRequestException,
            InvalidGrantException, InvalidCodeException, ServerException, UnauthorizedClientException,
            InvalidScopeException, NotFoundException, InvalidClientException, AuthorizationDeclinedException,
            ExpiredTokenException, BadRequestException, AuthorizationPendingException {

        // Client ID, Secret and code are required, all other parameters are optional
        final String clientId = request.getParameter(CLIENT_ID);
        final String clientSecret = request.getParameter(CLIENT_SECRET);
        final String code = request.getParameter(CODE);

        if (isEmpty(clientId) || isEmpty(clientSecret) || isEmpty(code)) {
            throw new BadRequestException("client_id, client_secret and code are required parameters");
        }

        ClientRegistration client = clientRegistrationStore.get(clientId, request);
        if (!clientSecret.equals(client.getClientSecret())) {
            throw failureFactory.getException();
        }

        DeviceCode deviceCode = tokenStore.readDeviceCode(clientId, code, request);

        if (deviceCode == null ||
                !clientId.equals(deviceCode.getClientId()) ||
                !request.getParameter(REALM).equals(deviceCode.getRealm())) {
            throw new AuthorizationDeclinedException();
        }

        try {
            if (deviceCode.isAuthorized()) {
                String grantType = request.getParameter(OAuth2Constants.Params.GRANT_TYPE);
                Set<String> scope = deviceCode.getScope();
                String resourceOwnerId = deviceCode.getResourceOwnerId();
                String validatedClaims = providerSettings.validateRequestedClaims(
                        deviceCode.getStringProperty(OAuth2Constants.Custom.CLAIMS));
                return generateAccessToken(providerSettings, grantType, clientId, resourceOwnerId, scope,
                        validatedClaims, request);
            }

            if (deviceCode.getExpiryTime() < System.currentTimeMillis()) {
                throw new ExpiredTokenException();
            }
        } finally {
            try {
                tokenStore.deleteDeviceCode(clientId, code, request);
            } catch (OAuth2Exception e) {
                logger.warn("Could not delete issued/expired device code", e);
            }
        }

        try {
            final long lastPollTime = deviceCode.getLastPollTime();
            if (lastPollTime + (providerSettings.getDeviceCodePollInterval() * 1000) > System.currentTimeMillis()) {
                throw new BadRequestException("slow_down", "The polling interval has not elapsed since the last request");
            }

            throw new AuthorizationPendingException();
        } finally {
            deviceCode.poll();
            tokenStore.updateDeviceCode(deviceCode, request);
        }
    }
