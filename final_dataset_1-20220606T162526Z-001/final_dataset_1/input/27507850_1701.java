@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EvpnType2Route)) {
      return false;
    }
    EvpnType2Route other = (EvpnType2Route) o;
    return (_hashCode == other._hashCode || _hashCode == 0 || other._hashCode == 0)
        && Objects.equals(_network, other._network)
        && _admin == other._admin
        && getNonRouting() == other.getNonRouting()
        && getNonForwarding() == other.getNonForwarding()
        && _discard == other._discard
        && Objects.equals(_ip, other._ip)
        && _localPreference == other._localPreference
        && Objects.equals(_macAddress, other._macAddress)
        && _med == other._med
        && _receivedFromRouteReflectorClient == other._receivedFromRouteReflectorClient
        && _weight == other._weight
        && Objects.equals(_asPath, other._asPath)
        && Objects.equals(_clusterList, other._clusterList)
        && Objects.equals(_communities, other._communities)
        && _nextHopInterface.equals(other._nextHopInterface)
        && Objects.equals(_nextHopIp, other._nextHopIp)
        && Objects.equals(_originatorIp, other._originatorIp)
        && _originType == other._originType
        && _protocol == other._protocol
        && Objects.equals(_receivedFromIp, other._receivedFromIp)
        && Objects.equals(_routeDistinguisher, other._routeDistinguisher)
        && _srcProtocol == other._srcProtocol
        && _tag == other._tag;
  }
