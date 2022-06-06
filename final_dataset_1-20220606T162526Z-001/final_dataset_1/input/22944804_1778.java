public AccessToken refreshToken(OAuth2Request request) throws InvalidClientException, InvalidRequestException,
            BadRequestException, ServerException, ExpiredTokenException, InvalidGrantException,
            InvalidScopeException, NotFoundException {

        Reject.ifTrue(isEmpty(request.<String>getParameter(REFRESH_TOKEN)), "Missing parameter, 'refresh_token'");

        final OAuth2ProviderSettings providerSettings = providerSettingsFactory.get(request);
        final OAuth2Uris uris = urisFactory.get(request);
        final ClientRegistration clientRegistration = clientAuthenticator.authenticate(request,
                uris.getTokenEndpoint());

        final String tokenId = request.getParameter(REFRESH_TOKEN);
        final RefreshToken refreshToken = tokenStore.readRefreshToken(request, tokenId);

        if (refreshToken == null) {
            logger.error("Refresh token does not exist for id: " + tokenId);
            throw new InvalidRequestException("RefreshToken does not exist");
        }

        if (!refreshToken.getClientId().equalsIgnoreCase(clientRegistration.getClientId())) {
            logger.error("Refresh Token was issued to a different client id: " + clientRegistration.getClientId());
            throw new InvalidRequestException("Token was issued to a different client");
        }

        if (refreshToken.isExpired()) {
            logger.warn("Refresh Token is expired for id: " + refreshToken.getTokenId());
            throw new InvalidGrantException("grant is invalid");
        }

        final Set<String> scope = splitScope(request.<String>getParameter(SCOPE));
        final String grantType = request.getParameter(GRANT_TYPE);

        final Set<String> tokenScope;
        if (refreshToken.getScope() != null) {
            tokenScope = new TreeSet<String>(refreshToken.getScope());
        } else {
            tokenScope = new TreeSet<String>();
        }

        final Set<String> validatedScope = providerSettings.validateRefreshTokenScope(clientRegistration,
                Collections.unmodifiableSet(scope), Collections.unmodifiableSet(tokenScope),
                request);

        final String validatedClaims = providerSettings.validateRequestedClaims(
                refreshToken.getStringProperty(OAuth2Constants.Custom.CLAIMS));

        RefreshToken newRefreshToken = null;
        if (providerSettings.issueRefreshTokensOnRefreshingToken()) {
            newRefreshToken = tokenStore.createRefreshToken(grantType, clientRegistration.getClientId(),
                    refreshToken.getResourceOwnerId(), refreshToken.getRedirectUri(), refreshToken.getScope(), request,
                    validatedClaims);

            tokenStore.deleteRefreshToken(refreshToken.getTokenId());
        }

        final AccessToken accessToken = tokenStore.createAccessToken(grantType, OAuth2Constants.Bearer.BEARER, null,
                refreshToken.getResourceOwnerId(), clientRegistration.getClientId(), refreshToken.getRedirectUri(),
                validatedScope, newRefreshToken == null ? refreshToken : newRefreshToken,
                null, validatedClaims, request);

        if (newRefreshToken != null) {
            accessToken.addExtraData(REFRESH_TOKEN, newRefreshToken.getTokenId());
        }

        providerSettings.additionalDataToReturnFromTokenEndpoint(accessToken, request);

        if (validatedScope != null && !validatedScope.isEmpty()) {
            accessToken.addExtraData(SCOPE, joinScope(validatedScope));
        }

        return accessToken;
    }
