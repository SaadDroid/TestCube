@VisibleForTesting
  static void addOspfInterfaces(
      CumulusNodeConfiguration vsConfig,
      Map<String, org.batfish.datamodel.Interface> viIfaces,
      String processId,
      Warnings w) {
    viIfaces.forEach(
        (ifaceName, iface) -> {
          Optional<OspfInterface> ospfOpt = vsConfig.getOspfInterface(ifaceName);
          if (!ospfOpt.isPresent() || ospfOpt.get().getOspfArea() == null) {
            return;
          }

          OspfInterface ospfInterface = ospfOpt.get();
          iface.setOspfSettings(
              OspfInterfaceSettings.builder()
                  .setPassive(
                      Optional.ofNullable(ospfInterface.getPassive())
                          .orElse(vsConfig.getOspfProcess().getDefaultPassiveInterface()))
                  .setAreaName(ospfInterface.getOspfArea())
                  .setNetworkType(toOspfNetworkType(ospfInterface.getNetwork(), w))
                  .setDeadInterval(
                      Optional.ofNullable(ospfInterface.getDeadInterval())
                          .orElse(DEFAULT_OSPF_DEAD_INTERVAL))
                  .setHelloInterval(
                      Optional.ofNullable(ospfInterface.getHelloInterval())
                          .orElse(DEFAULT_OSPF_HELLO_INTERVAL))
                  .setProcess(processId)
                  .setCost(ospfInterface.getCost())
                  .build());
        });
  }
