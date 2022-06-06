public Token<OzoneBlockTokenIdentifier> generateToken(String user,
      String blockId, EnumSet<AccessModeProto> modes, long maxLength) {
    OzoneBlockTokenIdentifier tokenIdentifier = createIdentifier(user,
        blockId, modes, maxLength);
    if (LOG.isTraceEnabled()) {
      long expiryTime = tokenIdentifier.getExpiryDate();
      String tokenId = tokenIdentifier.toString();
      LOG.trace("Issued delegation token -> expiryTime:{}, tokenId:{}",
          expiryTime, tokenId);
    }
    // Pass blockId as service.
    return new Token<>(tokenIdentifier.getBytes(),
        createPassword(tokenIdentifier), tokenIdentifier.getKind(),
        new Text(blockId));
  }
