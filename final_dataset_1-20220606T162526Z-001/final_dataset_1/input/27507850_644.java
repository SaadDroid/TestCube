@Nonnull
  ExprAclLine toIpAccessListLine(boolean ingress, Region region, String name, Warnings warnings) {
    if (_ipProtocol.equals("icmpv6")) {
      // Not valid in IPv4 packets.
      return ExprAclLine.accepting().setMatchCondition(FALSE).setName(name).build();
    }
    List<AclLineMatchExpr> protocolAndPortExprs = getMatchExprsForProtocolAndPorts(name, warnings);
    if (protocolAndPortExprs == null) {
      return ExprAclLine.accepting().setMatchCondition(FALSE).setName(name).build();
    }
    ImmutableList.Builder<AclLineMatchExpr> aclLineExprs = ImmutableList.builder();
    _ipRanges.stream()
        .map(
            ipRange ->
                new AndMatchExpr(
                    ImmutableList.<AclLineMatchExpr>builder()
                        .addAll(protocolAndPortExprs)
                        .add(
                            exprForSrcOrDstIps(
                                ipRange.getPrefix().toIpSpace(),
                                ipRange.getPrefix().toString(),
                                ingress,
                                AddressType.CIDR_IP))
                        .build(),
                    getTraceElementForRule(ipRange.getDescription())))
        .forEach(aclLineExprs::add);

    aclLineExprs.addAll(userIdGroupsToAclLineExprs(region, protocolAndPortExprs, ingress));
    aclLineExprs.addAll(
        collectPrefixListsIntoAclLineExprs(
            collectPrefixLists(region, _prefixList), protocolAndPortExprs, ingress));
    return ExprAclLine.accepting()
        .setMatchCondition(or(aclLineExprs.build()))
        // TODO Should we set this trace element? If so, to what?
        .setTraceElement(null)
        .setName(name)
        .build();
  }
