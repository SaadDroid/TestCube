@Override
    public boolean verify(final String host, final SSLSession session) {
        try {
            final Certificate[] certs = session.getPeerCertificates();
            final X509Certificate x509 = (X509Certificate) certs[0];
            verify(host, x509);
            return true;
        } catch (final SSLException ex) {
            if (LOG.isLoggable(Level.FINE)) {
                LOG.log(Level.FINE, ex.getMessage(), ex);
            }
            throw new RuntimeException("HostnameVerifier, socket reset for TTL");
        }
    }
