@Override
    public TokenProvider getTokenProvider(TokenType issuedTokenType) throws STSInitializationException{
        if (TokenType.SAML2.equals(issuedTokenType)) {
            return  SoapSamlTokenProvider.builder()
                    .tokenGenerationServiceConsumer(tokenServiceConsumer)
                    .amSessionInvalidator(amSessionInvalidatorProvider.get())
                    .threadLocalAMTokenCache(threadLocalAMTokenCache)
                    .stsInstanceId(stsInstanceId)
                    .realm(realm)
                    .xmlUtilities(xmlUtilities)
                    .authnContextMapper(saml2XmlTokenAuthnContextMapper)
                    .soapSTSAccessTokenProvider(soapSTSAccessTokenProvider)
                    .logger(logger)
                    .build();
        } else if (TokenType.OPENIDCONNECT.equals(issuedTokenType)) {
            return SoapOpenIdConnectTokenProvider.builder()
                    .tokenGenerationServiceConsumer(tokenServiceConsumer)
                    .amSessionInvalidator(amSessionInvalidatorProvider.get())
                    .threadLocalAMTokenCache(threadLocalAMTokenCache)
                    .stsInstanceId(stsInstanceId)
                    .realm(realm)
                    .xmlUtilities(xmlUtilities)
                    .soapSTSAccessTokenProvider(soapSTSAccessTokenProvider)
                    .authenticationContextReferenceMapper(soapOpenIdConnectTokenAuthnContextMapper)
                    .authenticationMethodsReferencesMapper(soapOpenIdConnectTokenAuthnMethodsReferencesMapper)
                    .logger(logger)
                    .build();
        }
        throw new STSInitializationException(ResourceException.BAD_REQUEST, "Unhandled outputTokenType specified in " +
                "getTokenProviderForTransformOperation. OutputTokenType: " + issuedTokenType);
    }
