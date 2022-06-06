public static boolean fastAggregateVerify(
      List<BLSPublicKey> publicKeys, Bytes message, BLSSignature signature) {
    if (BLSConstants.VERIFICATION_DISABLED) {
      LOG.warn("Skipping bls verification.");
      return true;
    }
    if (publicKeys.isEmpty()) return false;
    List<PublicKey> publicKeyObjects =
        publicKeys.stream().map(BLSPublicKey::getPublicKey).collect(Collectors.toList());
    return signature.getSignature().verify(publicKeyObjects, message);
  }
