public java.security.PublicKey getPublicKey(String keyAlias) {
        if (keyAlias == null || keyAlias.length() == 0) {
            return null;
        }
        java.security.PublicKey pkey = null;
        try {
            X509Certificate cert = (X509Certificate) ks.getCertificate(keyAlias);
            if (cert == null) {
                logger.error("Unable to retrieve certificate with alias '" + keyAlias + "' from keystore "
                        + "'" + this.keystoreFile + "'");
                return null;
            }
            pkey = cert.getPublicKey();
        } catch (KeyStoreException e) {
            logger.error("Unable to get public key:" + keyAlias, e);
        }
        return pkey;
    }
