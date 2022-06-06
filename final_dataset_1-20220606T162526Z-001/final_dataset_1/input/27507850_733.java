public AddressGroup toAddressGroup() {
    return new AddressGroup(
        name,
        ImmutableSortedSet.copyOf(firstNonNull(addresses, ImmutableSet.of())),
        ImmutableSortedSet.copyOf(firstNonNull(childGroupNames, ImmutableSet.of())));
  }
