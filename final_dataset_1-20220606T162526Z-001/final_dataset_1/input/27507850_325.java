@Override
  public List<TransformationStep> toTransformationSteps(
      Nat nat,
      @Nullable Map<String, AddressBookEntry> addressBookEntryMap,
      Ip interfaceIp,
      Warnings warnings) {
    checkArgument(nat.getType() == STATIC, "Prefix can only be used in static nat");

    ImmutableList.Builder<TransformationStep> builder = new Builder<>();
    builder.add(new ShiftIpAddressIntoSubnet(TransformationType.STATIC_NAT, _ipField, _prefix));

    return builder.build();
  }
