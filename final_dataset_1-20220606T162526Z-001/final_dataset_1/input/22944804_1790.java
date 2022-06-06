public AuthorizationToken authorize(OAuth2Request request) throws ResourceOwnerAuthenticationRequired,
            ResourceOwnerConsentRequired, InvalidClientException, UnsupportedResponseTypeException,
            RedirectUriMismatchException, InvalidRequestException, AccessDeniedException, ServerException,
            LoginRequiredException, BadRequestException, InteractionRequiredException,
            ResourceOwnerConsentRequiredException, InvalidScopeException, NotFoundException {

        final OAuth2ProviderSettings providerSettings = providerSettingsFactory.get(request);

        for (final AuthorizeRequestValidator requestValidator : requestValidators) {
            requestValidator.validateRequest(request);
        }

        final String clientId = request.getParameter(CLIENT_ID);
        final ClientRegistration clientRegistration = clientRegistrationStore.get(clientId, request);

        final Set<String> scope = Utils.splitScope(request.<String>getParameter(SCOPE));
        //plugin point
        final Set<String> validatedScope = providerSettings.validateAuthorizationScope(clientRegistration, scope,
                request);

        // is resource owner authenticated?
        final ResourceOwner resourceOwner = resourceOwnerSessionValidator.validate(request);

        final boolean consentSaved = providerSettings.isConsentSaved(resourceOwner,
                clientRegistration.getClientId(), validatedScope);

        //plugin point
        final boolean haveConsent = consentVerifier.verify(consentSaved, request, clientRegistration);

        if (!haveConsent) {
            String localeParameter = request.getParameter(LOCALE);
            String uiLocaleParameter = request.getParameter(UI_LOCALES);
            Locale locale = getLocale(uiLocaleParameter, localeParameter);
            if (locale == null) {
                locale = request.getLocale();
            }

            UserInfoClaims userInfo = null;
            try {
                userInfo = providerSettings.getUserInfo(request.getToken(AccessToken.class), request);
            } catch (UnauthorizedClientException e) {
                logger.debug("Couldn't get user info - continuing to display consent page without claims.", e);
            }

            String clientName = clientRegistration.getDisplayName(locale);
            if (clientName == null) {
                clientName = clientRegistration.getClientId();
                logger.warn("Client does not have a display name or client name set. using client ID {} for display",
                        clientName);
            }
            final String displayDescription = clientRegistration.getDisplayDescription(locale);
            final String clientDescription = displayDescription == null ? "" : displayDescription;
            final Map<String, String> scopeDescriptions = getScopeDescriptions(validatedScope,
                    clientRegistration.getScopeDescriptions(locale));
            final Map<String, String> claimDescriptions = getClaimDescriptions(userInfo.getValues(),
                    clientRegistration.getClaimDescriptions(locale));
            throw new ResourceOwnerConsentRequired(clientName, clientDescription, scopeDescriptions, claimDescriptions,
                    userInfo, resourceOwner.getName(providerSettings));
        }

        return tokenIssuer.issueTokens(request, clientRegistration, resourceOwner, scope, providerSettings);
    }
