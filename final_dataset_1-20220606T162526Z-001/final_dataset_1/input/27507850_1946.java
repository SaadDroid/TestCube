@Override
  public final Boolean visitIpIpSpace(IpIpSpace ipIpSpace) {
    return _ip.equals(ipIpSpace.getIp());
  }
