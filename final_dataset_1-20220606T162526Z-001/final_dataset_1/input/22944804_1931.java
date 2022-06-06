public SAML2CryptoProvider createSAML2CryptoProvider(SAML2Config config) throws TokenCreationException {
        /*
        Return a real SAML2CryptoProvider only if the configuration indicates that encryption or signing will be required.
         */
        if ((config != null) &&
                (config.signAssertion() || config.encryptAttributes() || config.encryptNameID() || config.encryptAssertion())) {
            return new SAML2CryptoProviderImpl(config);
        } else {
            return new FauxSAML2CryptoProvider();
        }
    }
