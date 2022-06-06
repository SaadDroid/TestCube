@Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OpenIdConnectTokenConfig) {
            OpenIdConnectTokenConfig otherConfig = (OpenIdConnectTokenConfig)other;
            return  issuer.equals(otherConfig.issuer) &&
                    signatureAlgorithm.equals(otherConfig.signatureAlgorithm) &&
                    Objects.equal(authorizedParty, otherConfig.authorizedParty) &&
                    audience.equals(otherConfig.audience) &&
                    (tokenLifetimeInSeconds == otherConfig.tokenLifetimeInSeconds) &&
                    claimMap.equals(otherConfig.claimMap) &&
                    Objects.equal(keystoreLocation, otherConfig.keystoreLocation) &&
                    Arrays.equals(keystorePassword, otherConfig.keystorePassword) &&
                    Objects.equal(signatureKeyAlias, otherConfig.signatureKeyAlias) &&
                    Objects.equal(customClaimMapperClass, otherConfig.customClaimMapperClass) &&
                    Objects.equal(customAuthenticationContextMapper, otherConfig.customAuthenticationContextMapper) &&
                    Objects.equal(customAuthenticationMethodReferencesMapper, otherConfig.customAuthenticationMethodReferencesMapper) &&
                    Objects.equal(publicKeyReferenceType, otherConfig.publicKeyReferenceType) &&
                    Arrays.equals(signatureKeyPassword, otherConfig.signatureKeyPassword) &&
                    Arrays.equals(clientSecret, otherConfig.clientSecret);
        }
        return false;
    }
