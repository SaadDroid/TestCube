static IkePhase1Key getMatchingPsk(
      IsakmpProfile isakmpProfile, Warnings w, Map<String, IkePhase1Key> ikePhase1Keys) {
    IkePhase1Key ikePhase1Key = null;
    String isakmpProfileName = isakmpProfile.getName();
    if (isakmpProfile.getLocalInterfaceName().equals(INVALID_LOCAL_INTERFACE)) {
      w.redFlag(
          String.format(
              "Invalid local address interface configured for ISAKMP profile %s",
              isakmpProfileName));
    } else if (isakmpProfile.getKeyring() == null) {
      w.redFlag(String.format("Keyring not set for ISAKMP profile %s", isakmpProfileName));
    } else if (!ikePhase1Keys.containsKey(isakmpProfile.getKeyring())) {
      w.redFlag(
          String.format(
              "Cannot find keyring %s for ISAKMP profile %s",
              isakmpProfile.getKeyring(), isakmpProfileName));
    } else {
      IkePhase1Key tempIkePhase1Key = ikePhase1Keys.get(isakmpProfile.getKeyring());
      if (tempIkePhase1Key.getLocalInterface().equals(INVALID_LOCAL_INTERFACE)) {
        w.redFlag(
            String.format(
                "Invalid local address interface configured for keyring %s",
                isakmpProfile.getKeyring()));
      } else if (tempIkePhase1Key.match(
          isakmpProfile.getLocalInterfaceName(), isakmpProfile.getMatchIdentity())) {
        // found a matching keyring
        ikePhase1Key = tempIkePhase1Key;
      }
    }
    return ikePhase1Key;
  }
