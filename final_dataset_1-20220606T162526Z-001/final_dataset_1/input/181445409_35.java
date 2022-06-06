@Nullable
    @Override
    public X509Certificate[] getPeerCertificates() {
        Certificate[] certificates;
        try {
            certificates = session.getPeerCertificates();
        } catch (Throwable ex) {
            return null;
        }

        List<X509Certificate> result = new ArrayList<>(certificates.length);
        for (Certificate certificate : certificates) {
            if (certificate instanceof X509Certificate) {
                result.add((X509Certificate) certificate);
            }
        }
        return (!result.isEmpty() ? result.toArray(new X509Certificate[0]) : null);
    }
