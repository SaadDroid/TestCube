public ResourceOwner validate(OAuth2Request request) throws ResourceOwnerAuthenticationRequired,
            AccessDeniedException, BadRequestException, InteractionRequiredException, LoginRequiredException,
            ServerException, NotFoundException {

        final OpenIdPrompt openIdPrompt = new OpenIdPrompt(request);

        if (!openIdPrompt.isValid()) {
            String message = "Invalid prompt parameter \"" + openIdPrompt.getOriginalValue() + "\"";
            logger.message(message);
            throw new BadRequestException(message);
        }

        SSOToken token = null;
        try {
            token = ssoTokenManager.createSSOToken(getHttpServletRequest(request.<Request>getRequest()));
        } catch (SSOException e) {
            logger.warning("Error authenticating user against OpenAM: ", e);
        }

        try {
            if (token == null) {
                token = ssoTokenManager.createSSOToken(request.getSession());
            }
        } catch (SSOException e) {
            logger.warning("Error authenticating user against OpenAM: ", e);
        }

        try {
            if (token != null) {
                try {
                    // As the organization in the token is stored in lowercase, we need to lower case the auth2realm
                    String auth2Realm = dnWrapper.orgNameToDN(
                            realmNormaliser.normalise((String) request.getParameter("realm"))).toLowerCase();
                    String tokenRealm = token.getProperty("Organization");

                    // auth2Realm can't be null as we would have an error earlier
                    if (!auth2Realm.equals(tokenRealm)){
                        throw authenticationRequired(request);
                    }
                } catch (SSOException e) {
                    throw new AccessDeniedException(e);
                }

                if (openIdPrompt.containsLogin()) {
                    throw authenticationRequired(request, token);
                }

                final String acrValuesStr = request.getParameter(ACR_VALUES);
                if (acrValuesStr != null) {
                    setCurrentAcr(token, request, acrValuesStr);
                }

                try {
                    final long authTime = stringToDate(token.getProperty(ISAuthConstants.AUTH_INSTANT)).getTime();

                    if (isPastMaxAge(getMaxAge(request), authTime)) {
                        alterMaxAge(request);
                        throw authenticationRequired(request, token);
                    }

                    final AMIdentity id = IdUtils.getIdentity(
                            AccessController.doPrivileged(AdminTokenAction.getInstance()),
                            token.getProperty(Constants.UNIVERSAL_IDENTIFIER));

                    return new OpenAMResourceOwner(id.getName(), id, authTime);

                } catch (Exception e) { //Exception as chance of MANY exception types here.
                    logger.error("Error authenticating user against OpenAM: ", e);
                    throw new LoginRequiredException();
                }
            } else if (PASSWORD.equals(request.getParameter(GRANT_TYPE))) {
                // If we're doing password grant type, the SSOToken will have been created and deleted again within
                // OpenAMResourceOwnerAuthenticator. The request will not have a session, and so the token will have
                // been null from the attempted creation in L148.
                return getResourceOwner(request.getToken(AccessToken.class));
            } else {
                if (openIdPrompt.containsNone()) {
                    logger.error("Not pre-authenticated and prompt parameter equals none.");
                    if (request.getParameter(OAuth2Constants.Params.RESPONSE_TYPE) != null) {
                        throw new InteractionRequiredException(Utils.isOpenIdConnectFragmentErrorType(splitResponseType(
                                request.<String>getParameter(RESPONSE_TYPE))) ? FRAGMENT : QUERY);

                    } else {
                        throw new InteractionRequiredException();
                    }
                } else if (!isRefreshToken(request)) {
                    throw authenticationRequired(request);
                } else {
                    return getResourceOwner(request.getToken(RefreshToken.class));
                }
            }
        } catch (SSOException | UnsupportedEncodingException | URISyntaxException e) {
            throw new AccessDeniedException(e);
        }
    }
