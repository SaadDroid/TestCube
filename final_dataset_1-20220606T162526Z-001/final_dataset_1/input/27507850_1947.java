@Override
  public final Boolean visitIpWildcardIpSpace(IpWildcardIpSpace ipWildcardIpSpace) {
    return ipWildcardIpSpace.getIpWildcard().containsIp(_ip);
  }
