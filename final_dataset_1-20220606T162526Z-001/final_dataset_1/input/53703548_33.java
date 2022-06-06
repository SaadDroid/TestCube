@SneakyThrows
    public X509Certificate loadCert(String certLocation) {
        CertificateFactory cf = CertificateFactory.getInstance("X509");
        Resource certRes = resourceLoader.getResource(certLocation);
        X509Certificate cert = (X509Certificate) cf.generateCertificate(certRes.getInputStream());
        return cert;
    }
