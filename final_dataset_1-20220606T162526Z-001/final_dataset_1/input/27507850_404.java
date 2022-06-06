@Override
  public List<TransformationStep> toTransformationSteps(
      Nat nat,
      @Nullable Map<String, AddressBookEntry> addressBookEntryMap,
      Ip interfaceIp,
      Warnings warnings) {
    checkArgument(nat.getType() == Type.STATIC, "prefix name is only supported in static nat");
    checkArgument(addressBookEntryMap != null, "address book cannot be null");

    AddressBookEntry addressBookEntry = addressBookEntryMap.get(_name);

    if (!(addressBookEntry instanceof AddressAddressBookEntry)) {
      throw new BatfishException("unknown address book entry");
    }

    AddressAddressBookEntry addressAddressBookEntry = (AddressAddressBookEntry) addressBookEntry;
    Prefix subnet = addressAddressBookEntry.getIpWildcard().toPrefix();

    return ImmutableList.of(
        new ShiftIpAddressIntoSubnet(TransformationType.STATIC_NAT, _ipField, subnet));
  }
