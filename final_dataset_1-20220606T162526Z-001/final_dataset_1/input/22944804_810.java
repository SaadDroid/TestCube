public SessionInfo fromJwt(@Nonnull String jwtString) throws JwtRuntimeException {

        Reject.ifNull(jwtString, "jwtString must not be null.");

        SignedJwt signedJwt;

        if (encryptionKeyPair != null) {

            // could throw JwtRuntimeException
            SignedEncryptedJwt signedEncryptedJwt = jwtBuilderFactory.reconstruct(jwtString, SignedEncryptedJwt.class);
            signedEncryptedJwt.decrypt(encryptionKeyPair.getPrivate());
            signedJwt = signedEncryptedJwt;

        } else {

            // could throw JwtRuntimeException
            signedJwt = jwtBuilderFactory.reconstruct(jwtString, SignedJwt.class);

        }

        if (!doesJwtAlgorithmMatch(signedJwt) || !signedJwt.verify(verificationHandler)) {
            throw new JwtRuntimeException("Invalid JWT!");
        }

        JwtClaimsSet claimsSet = signedJwt.getClaimsSet();
        String serializedSession = claimsSet.getClaim(SERIALIZED_SESSION_CLAIM, String.class);
        return fromJson(serializedSession);
    }
