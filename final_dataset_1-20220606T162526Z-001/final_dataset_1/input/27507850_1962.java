@Override
  public Ip getValue(PacketHeaderConstraints phc, Location srcLocation) {
    String headerDstIp = phc.getDstIps();
    return Optional.ofNullable(headerDstIp)
        .map(_helper::inferDstIpFromHeaderDstIp)
        .orElse(DEFAULT_IP_ADDRESS);
  }
