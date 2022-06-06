@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BgpPeerConfigId)) {
      return false;
    }
    BgpPeerConfigId other = (BgpPeerConfigId) o;
    return (_hashCode == other._hashCode || _hashCode == 0 || other._hashCode == 0)
        && _type == other._type
        && _hostname.equals(other._hostname)
        && _vrfName.equals(other._vrfName)
        && Objects.equals(_peerInterface, other._peerInterface)
        && Objects.equals(_remotePeerPrefix, other._remotePeerPrefix);
  }
