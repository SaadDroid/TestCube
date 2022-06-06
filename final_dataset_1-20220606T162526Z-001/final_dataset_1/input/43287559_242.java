public static Certificate toCert(byte[] bytes) {
        if (bytes == null) {
            throw new IllegalArgumentException("Input bytes can not be null");
        }
        try {
            CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
            return certFactory.generateCertificate(new ByteArrayInputStream(bytes));
        } catch (CertificateException e) {
            throw new IllegalArgumentException("Certificate generation failed", e);
        }
    }
