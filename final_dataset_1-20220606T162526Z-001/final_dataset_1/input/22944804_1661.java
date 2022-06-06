public java.security.PrivateKey getPrivateKey(String certAlias) {
        java.security.PrivateKey key = null;
        try {
            key = (PrivateKey) ks.getKey(certAlias,
                    privateKeyPass.toCharArray());
        } catch (KeyStoreException e) {
            logger.error(e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage());
        } catch (UnrecoverableKeyException e) {
            logger.error(e.getMessage());
        }
        return key;
    }
