public AclLineMatchExpr toAclLineMatchExpr() {
    HeaderSpace.Builder hb =
        HeaderSpace.builder()
            .setSrcIps(_srcIp.toIpSpace())
            .setDstIps(_dstIp.toIpSpace())
            .setIpProtocols(ImmutableList.of(_ipProtocol));

    if (_srcPort != null) {
      hb.setSrcPorts(ImmutableList.of(SubRange.singleton(_srcPort)))
          .setDstPorts(ImmutableList.of(SubRange.singleton(_dstPort)));
    }

    return new MatchHeaderSpace(hb.build());
  }
