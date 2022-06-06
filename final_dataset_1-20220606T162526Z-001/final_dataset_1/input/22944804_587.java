@Override
    public String getRequestingPartyId(OAuth2Request oAuth2Request, AccessToken authorizationApiToken,
            JsonValue claimToken) {

        try {
            SignedJwt idToken = jwtReconstruction.reconstructJwt(claimToken.asString(), SignedJwt.class);

            OAuth2ProviderSettings oAuth2ProviderSettings = oauth2ProviderSettingsFactory.get(oAuth2Request);
            OAuth2Uris oAuth2Uris = oAuth2UrisFactory.get(oAuth2Request);
            byte[] clientSecret = clientRegistrationStore.get(authorizationApiToken.getClientId(), oAuth2Request)
                    .getClientSecret().getBytes(Utils.CHARSET);
            KeyPair keyPair = oAuth2ProviderSettings.getServerKeyPair();

            if (!idToken.getClaimsSet().getIssuer().equals(oAuth2Uris.getIssuer())) {
                logger.warn("Issuer of id token, {0}, does not match issuer of authorization server, {1}.",
                        idToken.getClaimsSet().getIssuer(), oAuth2Uris.getIssuer());
                return null;
            }

            if (!verify(clientSecret, keyPair, idToken)) {
                logger.warn("Signature of id token is invalid.");
                return null;
            }

            return idToken.getClaimsSet().getSubject();
        } catch (InvalidClientException e) {
            logger.error("Failed to find client", e);
            return null;
        } catch (NotFoundException | ServerException e) {
            logger.error("Failed to find OAuth2 settings", e);
            return null;
        }
    }
