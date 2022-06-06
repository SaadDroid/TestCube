@VisibleForTesting
  static void computeLayer2SelfEdges(
      @Nonnull Configuration config, @Nonnull Consumer<Layer2Edge> edges) {
    String hostname = config.getHostname();
    Map<Integer, ImmutableList.Builder<String>> switchportsByVlanBuilder = new HashMap<>();
    config.getAllInterfaces().values().stream()
        .filter(Interface::getActive)
        .forEach(
            i -> {
              if (i.getSwitchportMode() == SwitchportMode.TRUNK) {
                i.getAllowedVlans().stream()
                    .forEach(
                        vlan ->
                            switchportsByVlanBuilder
                                .computeIfAbsent(vlan, n -> ImmutableList.builder())
                                .add(i.getName()));
              } else if (i.getSwitchportMode() == SwitchportMode.ACCESS
                  && i.getAccessVlan() != null) {
                switchportsByVlanBuilder
                    .computeIfAbsent(i.getAccessVlan(), n -> ImmutableList.builder())
                    .add(i.getName());
              }
            });
    // Note that since the L2 model is transitive, we only need add a single spanning tree rather
    // than all O(N^2) edges to get complete connectivity for all interfaces on the same switchport.
    // Additionally, edges need not be added symmetrically.
    Map<Integer, List<String>> switchportsByVlan =
        CollectionUtil.toImmutableMap(
            switchportsByVlanBuilder, Entry::getKey, e -> e.getValue().build());
    switchportsByVlan.forEach(
        (vlanId, interfaceNames) -> {
          String firstInterface = interfaceNames.get(0);
          Layer2Node firstNode = new Layer2Node(hostname, firstInterface, vlanId);
          for (String otherInterface : interfaceNames.subList(1, interfaceNames.size())) {
            Layer2Node otherNode = new Layer2Node(hostname, otherInterface, vlanId);
            edges.accept(new Layer2Edge(firstNode, otherNode, null));
          }
        });
    Map<Integer, Layer2Vni> vniSettingsByVlan =
        config.getVrfs().values().stream()
            .flatMap(vrf -> vrf.getLayer2Vnis().values().stream())
            .collect(ImmutableMap.toImmutableMap(Layer2Vni::getVlan, Function.identity()));
    config.getAllInterfaces().values().stream()
        .filter(Interface::getActive)
        .filter(i -> i.getInterfaceType() == InterfaceType.VLAN && i.getVlan() != null)
        .forEach(
            irbInterface -> {
              String irbName = irbInterface.getName();
              int vlanId = irbInterface.getVlan();
              computeSelfSwitchportNonSwitchportEdges(switchportsByVlan, hostname, irbName, vlanId)
                  .forEach(edges::accept);
              // Link IRB to VNI in same VLAN
              Optional.ofNullable(vniSettingsByVlan.get(vlanId))
                  .map(vniSettings -> computeVniName(vniSettings.getVni()))
                  .ifPresent(
                      vniName ->
                          edges.accept(
                              new Layer2Edge(
                                  hostname, irbName, null, hostname, vniName, null, null)));
            });
    // Link each VNI to switchports in same VLAN
    vniSettingsByVlan.forEach(
        (vlanId, vniSettings) -> {
          String vniName = computeVniName(vniSettings.getVni());
          computeSelfSwitchportNonSwitchportEdges(switchportsByVlan, hostname, vniName, vlanId)
              .forEach(edges::accept);
        });
  }
