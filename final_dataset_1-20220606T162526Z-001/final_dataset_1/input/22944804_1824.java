public AccessToken handle(OAuth2Request request, ClientRegistration clientRegistration,
            OAuth2ProviderSettings providerSettings) throws RedirectUriMismatchException, InvalidClientException,
            InvalidRequestException,  InvalidCodeException, InvalidGrantException,
            ServerException, NotFoundException {

        for (final AuthorizationCodeRequestValidator requestValidator : requestValidators) {
            requestValidator.validateRequest(request, clientRegistration);
        }

        final String code = request.getParameter(OAuth2Constants.Params.CODE);
        final String redirectUri = request.getParameter(OAuth2Constants.Params.REDIRECT_URI);

        final AuthorizationCode authorizationCode = tokenStore.readAuthorizationCode(request, code);

        if (authorizationCode == null) {
            logger.error("Authorization code doesn't exist, " + code);
            throw new InvalidRequestException("Authorization code doesn't exist.");
        }

        final String codeVerifier = request.getParameter(OAuth2Constants.Custom.CODE_VERIFIER);
        if (providerSettings.isCodeVerifierRequired()) {
            if (codeVerifier == null) {
                String message = "code_verifier parameter required";
                throw new InvalidRequestException(message);
            }
        }

        AccessToken accessToken;
        Set<String> authorizationScope;
        // Only allow one request per code through here at a time, to prevent replay.
        synchronized (code.intern()) {
            if (authorizationCode.isIssued()) {
                tokenInvalidator.invalidateTokens(code);
                tokenStore.deleteAuthorizationCode(code);
                logger.error("Authorization Code has already been issued, " + code);
                throw new InvalidGrantException();
            }

            if (!authorizationCode.getRedirectUri().equalsIgnoreCase(redirectUri)) {
                logger.error("Authorization code was issued with a different redirect URI, " + code + ". Expected, "
                        + authorizationCode.getRedirectUri() + ", actual, " + redirectUri);
                throw new InvalidGrantException();
            }

            if (!authorizationCode.getClientId().equalsIgnoreCase(clientRegistration.getClientId())) {
                logger.error("Authorization Code was issued to a different client, " + code + ". Expected, "
                        + authorizationCode.getClientId() + ", actual, " + clientRegistration.getClientId());
                throw new InvalidGrantException();
            }

            if (authorizationCode.isExpired()) {
                logger.error("Authorization code has expired, " + code);
                throw new InvalidCodeException("Authorization code expired.");
            }

            if (providerSettings.isCodeVerifierRequired()) {
                checkCodeVerifier(authorizationCode, codeVerifier);
            }

            final String grantType = request.getParameter(OAuth2Constants.Params.GRANT_TYPE);
            authorizationScope = authorizationCode.getScope();
            final String resourceOwnerId = authorizationCode.getResourceOwnerId();
            final String validatedClaims = providerSettings.validateRequestedClaims(
                    authorizationCode.getStringProperty(OAuth2Constants.Custom.CLAIMS));

            accessToken = accessTokenGenerator.generateAccessToken(providerSettings, grantType,
                    clientRegistration.getClientId(), resourceOwnerId, redirectUri, authorizationScope, validatedClaims,
                    code, authorizationCode.getNonce(), request);

            authorizationCode.setIssued();
            tokenStore.updateAuthorizationCode(authorizationCode);
        }

        final String nonce = authorizationCode.getNonce();
        accessToken.addExtraData(OAuth2Constants.Custom.NONCE, nonce);
        accessToken.addExtraData(OAuth2Constants.Custom.SSO_TOKEN_ID, authorizationCode.getSessionId());

        providerSettings.additionalDataToReturnFromTokenEndpoint(accessToken, request);
        accessToken.addExtraData(OAuth2Constants.Custom.SSO_TOKEN_ID, null);

        // We should report the scope originally consented to and not the scope added to this request
        if (authorizationScope != null && !authorizationScope.isEmpty()) {
            accessToken.addExtraData(OAuth2Constants.Params.SCOPE, joinScope(authorizationScope));
        }

        return accessToken;
    }
