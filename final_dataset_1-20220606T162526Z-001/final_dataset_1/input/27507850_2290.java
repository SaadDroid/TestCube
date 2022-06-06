public static BDD toBDD(
      BDDPacket pkt,
      IpAccessList acl,
      Map<String, IpAccessList> aclEnv,
      Map<String, IpSpace> ipSpaceEnv,
      BDDSourceManager bddSrcManager) {
    return new IpAccessListToBddImpl(pkt, bddSrcManager, aclEnv, ipSpaceEnv).toBdd(acl);
  }
