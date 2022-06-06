@Override
  public List<TransformationStep> toTransformationSteps(
      Nat nat,
      @Nullable Map<String, AddressBookEntry> addressBookEntryMap,
      Ip interfaceIp,
      Warnings warnings) {
    checkArgument(
        (nat.getType() == SOURCE || nat.getType() == DESTINATION),
        "Interface actions can only be used in source nat and dest nat");

    TransformationType type = nat.getType().toTransformationType();
    IpField ipField = nat.getType() == SOURCE ? IpField.SOURCE : IpField.DESTINATION;

    NatPool pool = nat.getPools().get(_poolName);
    if (pool == null) {
      // pool is undefined.
      return ImmutableList.of();
    }

    Ip from = pool.getFromAddress();
    Ip to = pool.getToAddress();
    if (from.asLong() > to.asLong()) {
      warnings.redFlag(String.format("NAT pool %s is invalid: %s - %s", _poolName, from, to));
      return ImmutableList.of();
    }

    ImmutableList.Builder<TransformationStep> builder = new Builder<>();
    builder.add(new AssignIpAddressFromPool(type, ipField, from, to));

    PortAddressTranslation pat = pool.getPortAddressTranslation();

    if (pat != null) {
      PortField portField = nat.getType() == SOURCE ? PortField.SOURCE : PortField.DESTINATION;
      Optional<TransformationStep> patStep = pat.toTransformationStep(type, portField);
      patStep.ifPresent(builder::add);
    } else if (type == SOURCE_NAT) {
      builder.add(
          new AssignPortFromPool(
              type, PortField.SOURCE, nat.getDefaultFromPort(), nat.getDefaultToPort()));
    }

    return builder.build();
  }
