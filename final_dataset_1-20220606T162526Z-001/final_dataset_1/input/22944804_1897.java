@Override
    public boolean equals(Object other) {
        if (other instanceof SAML2Config) {
            SAML2Config otherConfig = (SAML2Config)other;
            return  nameIdFormat.equals(otherConfig.nameIdFormat) &&
                    idpId.equals(otherConfig.idpId) &&
                    tokenLifetimeInSeconds == otherConfig.tokenLifetimeInSeconds &&
                    attributeMap.equals(otherConfig.attributeMap) &&
                    signAssertion == otherConfig.signAssertion &&
                    encryptAssertion == otherConfig.encryptAssertion &&
                    encryptAttributes == otherConfig.encryptAttributes &&
                    encryptNameID == otherConfig.encryptNameID &&
                    encryptionAlgorithmStrength == otherConfig.encryptionAlgorithmStrength &&
                    spEntityId.equals(otherConfig.spEntityId) &&
                    Objects.equal(encryptionAlgorithm, otherConfig.encryptionAlgorithm) &&
                    Objects.equal(customConditionsProviderClassName, otherConfig.customConditionsProviderClassName) &&
                    Objects.equal(customSubjectProviderClassName, otherConfig.customSubjectProviderClassName) &&
                    Objects.equal(customAttributeStatementsProviderClassName, otherConfig.customAttributeStatementsProviderClassName) &&
                    Objects.equal(customAuthzDecisionStatementsProviderClassName, otherConfig.customAuthzDecisionStatementsProviderClassName) &&
                    Objects.equal(customAttributeMapperClassName, otherConfig.customAttributeMapperClassName) &&
                    Objects.equal(customAuthNContextMapperClassName, otherConfig.customAuthNContextMapperClassName) &&
                    Objects.equal(customAuthenticationStatementsProviderClassName, otherConfig.customAuthenticationStatementsProviderClassName) &&
                    Objects.equal(keystoreFileName, otherConfig.keystoreFileName) &&
                    Arrays.equals(keystorePassword, otherConfig.keystorePassword) &&
                    Objects.equal(spAcsUrl, otherConfig.spAcsUrl) &&
                    Objects.equal(signatureKeyAlias, otherConfig.signatureKeyAlias) &&
                    Objects.equal(encryptionKeyAlias, otherConfig.encryptionKeyAlias) &&
                    Arrays.equals(signatureKeyPassword, otherConfig.signatureKeyPassword);
        }
        return false;
    }
