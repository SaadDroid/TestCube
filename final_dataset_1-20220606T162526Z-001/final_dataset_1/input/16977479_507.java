protected void validateSignature(JwsHeaders headers, String unsignedText, byte[] signature) {
        JwsSignatureVerifier theSigVerifier = getInitializedSigVerifier(headers);
        if (!theSigVerifier.verify(headers, unsignedText, signature)) {
            throw new OAuthServiceException(OAuthConstants.INVALID_GRANT);
        }
    }
