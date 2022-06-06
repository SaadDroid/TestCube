@VisibleForTesting
  static SortedMap<Long, OspfArea> computeOspfAreas(
      CumulusNodeConfiguration vsConfig, Collection<String> vrfIfaceNames) {
    Map<Long, List<String>> areaInterfaces =
        vrfIfaceNames.stream()
            .filter(
                iface -> {
                  Optional<OspfInterface> ospfOpt = vsConfig.getOspfInterface(iface);
                  return ospfOpt.isPresent() && ospfOpt.get().getOspfArea() != null;
                })
            .collect(
                groupingBy(
                    iface -> vsConfig.getOspfInterface(iface).get().getOspfArea(),
                    mapping(Function.identity(), Collectors.toList())));

    return toImmutableSortedMap(
        areaInterfaces,
        Entry::getKey,
        e -> OspfArea.builder().setNumber(e.getKey()).addInterfaces(e.getValue()).build());
  }
