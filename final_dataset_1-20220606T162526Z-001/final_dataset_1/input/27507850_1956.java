@Override
  public Ip getValue(PacketHeaderConstraints phc, Location srcLocation) {
    String headerSrcIp = phc.getSrcIps();

    if (headerSrcIp != null) {
      return _helper.inferSrcIpFromHeaderSrcIp(headerSrcIp);
    }

    checkArgument(srcLocation != null, "source location is missing");
    return _helper.inferSrcIpFromSourceLocation(srcLocation);
  }
