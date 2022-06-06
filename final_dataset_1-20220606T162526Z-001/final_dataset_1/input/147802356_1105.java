@Override
  public SafeFuture<BLSSignature> signAttestationData(
      final AttestationData attestationData, final ForkInfo forkInfo) {
    return sign(signingRootForSignAttestationData(attestationData, forkInfo));
  }
