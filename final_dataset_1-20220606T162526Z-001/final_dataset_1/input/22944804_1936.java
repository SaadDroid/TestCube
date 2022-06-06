public IssueOperation get() {
        //TODO: migrate to throwing providers
        try {
            TokenIssueOperation tokenIssueOperation = new TokenIssueOperation();
            /*
            The STS will not encrypt the issued tokens - the TokenGenerationService already offers functionality to
            encrypt issued SAML assertions.
             */
            tokenIssueOperation.setEncryptIssuedToken(false);
            tokenIssueOperation.setStsProperties(stsPropertiesMBean);
            tokenIssueOperation.setTokenStore(tokenStore);
            /*
            Set the tokenValidators which will be called to validate the tokens presented as ActAs or OnBehalfOf
            elements
             */
            tokenIssueOperation.setTokenValidators(getDelegationTokenValidators());

            /*
            Set the TokenDelegationHandlers (either empty if this sts instance will not process ActAs or OnBehalfOf elements,
            or with the DefaultTokenDelegationHandler, or with user-specified custom handlers.
             */
            tokenIssueOperation.setDelegationHandlers(tokenDelegationHandlers);

            List<TokenProvider> tokenProviders = new ArrayList<TokenProvider>();
            for(TokenType tokenType: issueTokenTypes) {
                tokenProviders.add(operationFactory.getTokenProvider(tokenType));
            }
            tokenIssueOperation.setTokenProviders(tokenProviders);
            return new TokenIssueOperationWrapper(tokenIssueOperation, threadLocalAMTokenCache);
        } catch (STSInitializationException e) {
            logger.error("Exception caught initializing a IssueOperation: " + e, e);
            throw new RuntimeException(e);
        }
    }
