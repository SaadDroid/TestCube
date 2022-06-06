@Override
    public UnverifiedKeyBindingType locate(LocateRequestType request) {
        List<UseKeyWithType> keyIDs = parse(request);
        X509Certificate cert;
        try {
            cert = findCertificate(keyIDs);
            if (cert == null) {
                return null;
            }
            UnverifiedKeyBindingType result = new UnverifiedKeyBindingType();
            result.setKeyInfo(X509Utils.getKeyInfo(cert));
            return result;
        } catch (CertificateEncodingException e) {
            throw new XKMSCertificateException("Cannot encode certificate: " + e.getMessage(), e);
        } catch (CertificateException e1) {
            throw new XKMSCertificateException(e1.getMessage(), e1);
        }
    }
