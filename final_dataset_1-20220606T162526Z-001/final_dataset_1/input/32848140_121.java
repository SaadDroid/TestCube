public static KeyStore loadKeyStore(File certificateChainFile, File privateKeyFile, String keyPassword)
        throws IOException, GeneralSecurityException
    {
        PrivateKey key;
        try {
            key = createPrivateKey(privateKeyFile, keyPassword);
        } catch (OperatorCreationException | IOException | GeneralSecurityException | PKCSException e) {
            throw new GeneralSecurityException("Private Key issues", e);
        }

        List<X509Certificate> certificateChain = readCertificateChain(certificateChainFile);
        if (certificateChain.isEmpty()) {
            throw new CertificateException("Certificate file does not contain any certificates: " + certificateChainFile);
        }

        KeyStore keyStore = KeyStore.getInstance("JKS");
        keyStore.load(null, null);
        keyStore.setKeyEntry("key", key, keyPassword.toCharArray(), certificateChain.stream().toArray(Certificate[]::new));
        return keyStore;
    }
