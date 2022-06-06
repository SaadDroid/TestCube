public void verifyAuthId(String realmDN, String authId) throws RestAuthException {

        SecretKey key = getSigningKey(realmDN);

        try {
            final SigningHandler signingHandler = signingManager.newHmacSigningHandler(key.getEncoded());
            boolean verified = jwtBuilderFactory.reconstruct(authId, SignedJwt.class).verify(signingHandler);
            if (!verified) {
                throw new RestAuthException(ResourceException.BAD_REQUEST, "AuthId JWT Signature not valid");
            }
        } catch (JwtRuntimeException e) {
            throw new RestAuthException(ResourceException.BAD_REQUEST, "Failed to parse JWT, "
                    + e.getLocalizedMessage(), e);
        }
    }
