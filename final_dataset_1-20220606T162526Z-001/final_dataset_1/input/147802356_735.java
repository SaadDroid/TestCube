public static boolean verify(BLSPublicKey publicKey, Bytes message, BLSSignature signature) {
    if (BLSConstants.VERIFICATION_DISABLED) {
      LOG.warn("Skipping bls verification.");
      return true;
    }
    return signature.getSignature().verify(publicKey.getPublicKey(), message);
  }
