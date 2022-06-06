@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AddressFamilyCapabilities)) {
      return false;
    }
    AddressFamilyCapabilities that = (AddressFamilyCapabilities) o;
    return _additionalPathsReceive == that._additionalPathsReceive
        && _additionalPathsSelectAll == that._additionalPathsSelectAll
        && _additionalPathsSend == that._additionalPathsSend
        && _advertiseExternal == that._advertiseExternal
        && _advertiseInactive == that._advertiseInactive
        && _allowLocalAsIn == that._allowLocalAsIn
        && _allowRemoteAsOut == that._allowRemoteAsOut
        && _sendCommunity == that._sendCommunity
        && _sendExtendedCommunity == that._sendExtendedCommunity;
  }
