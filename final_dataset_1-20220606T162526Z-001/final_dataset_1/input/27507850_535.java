@VisibleForTesting
  static @Nonnull RouteFilterList toRouteFilterList(IpPrefixList ipPrefixList) {
    String name = ipPrefixList.getName();
    RouteFilterList rfl = new RouteFilterList(name);
    rfl.setLines(
        ipPrefixList.getLines().values().stream()
            .map(CumulusConversions::toRouteFilterLine)
            .collect(ImmutableList.toImmutableList()));
    return rfl;
  }
