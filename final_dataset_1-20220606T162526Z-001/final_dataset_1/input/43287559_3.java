@SuppressWarnings("unchecked")
    public void verify(CMSSignature signature) throws CryptoException {
        Store certStore = signature.getSignedDataCertificates();
        SignerInformationStore signerInformationStore = signature.getSignerInformationStore();
        Collection<SignerInformation> signerCollection = signerInformationStore.getSigners();
        if (signerCollection.isEmpty()) {
            throw new InvalidCmsSignatureException("Invalid CMS signature. Signature does not contain SignerInformation element.");
        }
        if (signerCollection.size() != 1) {
            throw new InvalidCmsSignatureException("Invalid CMS signature. Signature contains multiple SignerInformation elements.");
        }
        SignerInformation signerInfo = signerCollection.iterator().next();
        Collection certCollection = certStore.getMatches(signerInfo.getSID());
        Iterator certIterator = certCollection.iterator();

        if (certCollection.isEmpty()) {
            throw new InvalidCmsSignatureException("Invalid CMS signature. Signer certificate collection is empty.");
        }

        X509CertificateHolder certHolder = (X509CertificateHolder) certIterator.next();
        verifyCmsSignerInfo(signerInfo, certHolder);
        if(!trustStore.isTrusted(getCertificate(certHolder), certStore)) {
            throw new InvalidCmsSignatureException("Certificate that was used for signing isn't trusted");
        }
    }
