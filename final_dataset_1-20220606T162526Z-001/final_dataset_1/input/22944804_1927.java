public String generate(SSOToken subjectToken, STSInstanceState stsInstanceState,
                               TokenGenerationServiceInvocationState invocationState) throws TokenCreationException {

        final SAML2Config saml2Config = stsInstanceState.getConfig().getSaml2Config();
        if (saml2Config == null) {
            throw new TokenCreationException(ResourceException.BAD_REQUEST,
                    "Invocation targets a SAML2 token, but no SAML2Config was specified in the published sts!");
        }
        final String subjectId = ssoTokenIdentity.validateAndGetTokenPrincipal(subjectToken);
        final Assertion assertion = AssertionFactory.getInstance().createAssertion();
        setVersionAndId(assertion);
        setIssuer(assertion, saml2Config);

        final Date issueInstant = new Date();
        setIssueInstant(assertion, issueInstant);
        final SAML2TokenGenerationState tokenGenerationState = invocationState.getSaml2TokenGenerationState();
        setConditions(assertion, saml2Config, issueInstant, tokenGenerationState.getSaml2SubjectConfirmation());
        setSubject(assertion, subjectId, saml2Config.getSpAcsUrl(), saml2Config,
                invocationState.getSaml2TokenGenerationState().getSaml2SubjectConfirmation(), issueInstant,
                tokenGenerationState.getProofTokenState());
        setAuthenticationStatements(assertion, saml2Config, tokenGenerationState.getAuthnContextClassRef());
        setAttributeStatements(assertion, subjectToken, saml2Config);
        setAuthzDecisionStatements(assertion, subjectToken, saml2Config);
        /*
        entering this branch handles both encryption and signing, as the encryption of the entire assertion must be
        proceeded by signing.
         */
        String assertionString;
        if (saml2Config.encryptAssertion()) {
            EncryptedAssertion encryptedAssertion = handleSingingAndEncryptionOfEntireAssertion(assertion, saml2Config, stsInstanceState);
            try {
                assertionString = encryptedAssertion.toXMLString(ASSERTION_TO_STRING_INCLUDE_NAMESPACE_PREFIX, ASSERTION_TO_STRING_DECLARE_NAMESPACE_PREFIX);
            } catch (SAML2Exception e) {
                throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                        "Exception caught calling Assertion.toXMLString: " + e, e);
            }
        } else {
            if (saml2Config.encryptAttributes()) {
                encryptAttributeStatement(assertion, saml2Config, stsInstanceState);
            }
            if (saml2Config.encryptNameID()) {
                encryptNameID(assertion, saml2Config, stsInstanceState);
            }
            if (saml2Config.signAssertion()) {
                signAssertion(assertion, stsInstanceState);
            }
            try {
                assertionString =
                        assertion.toXMLString(ASSERTION_TO_STRING_INCLUDE_NAMESPACE_PREFIX, ASSERTION_TO_STRING_DECLARE_NAMESPACE_PREFIX);
            } catch (SAML2Exception e) {
                throw new TokenCreationException(ResourceException.INTERNAL_ERROR,
                        "Exception caught calling Assertion.toXMLString: " + e, e);
            }
        }
        if (stsInstanceState.getConfig().persistIssuedTokensInCTS()) {
            try {
                ctsTokenPersistence.persistToken(invocationState.getStsInstanceId(), TokenType.SAML2, assertionString,
                        subjectId, issueInstant.getTime(), saml2Config.getTokenLifetimeInSeconds());
            } catch (CTSTokenPersistenceException e) {
                throw new TokenCreationException(e.getCode(), e.getMessage(), e);
            }
        }
        return assertionString;
    }
