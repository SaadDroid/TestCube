static List<NetworkAcl> findSubnetNetworkAcl(
      Map<String, NetworkAcl> networkAcls, String vpcId, String subnetId) {
    List<NetworkAcl> subnetAcls =
        networkAcls.values().stream()
            .filter(acl -> acl.getVpcId().equals(vpcId))
            .filter(
                acl ->
                    acl.getAssociations().stream()
                        .map(NetworkAclAssociation::getSubnetId)
                        .anyMatch(subnetId::equals))
            .collect(ImmutableList.toImmutableList());

    if (!subnetAcls.isEmpty()) {
      return subnetAcls;
    }

    /*
     use the default for the VPC if we don't find an explicit association. this is mostly a
     defensive move, as AWS appears to provide explicit associations at the moment
    */
    return networkAcls.values().stream()
        .filter(acl -> acl.getVpcId().equals(vpcId) && acl.isDefault())
        .collect(ImmutableList.toImmutableList());
  }
