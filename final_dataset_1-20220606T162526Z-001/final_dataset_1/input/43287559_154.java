public Certificate findCertificateById(byte[] certificateId) throws CertificateNotFoundException {
        if (certificateId == null) {
            throw new CertificateNotFoundException("Certificate with id null not found from pubFile='" + this.toString() + "'");
        }
        for (InMemoryCertificateRecord record : certificateRecords) {
            if (Arrays.equals(certificateId, record.getCertificateId())) {
                return X509CertUtil.toCert(record.getCertificate());
            }
        }
        throw new CertificateNotFoundException("Certificate with id " + Base64.encode(certificateId) + " not found from pubFile='" + this.toString() + "'");
    }
