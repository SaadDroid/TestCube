public static void initNeighborConfigs(NetworkConfigurations configurations) {
    for (Configuration config : configurations.all()) {
      for (Vrf vrf : config.getVrfs().values()) {
        for (EigrpProcess proc : vrf.getEigrpProcesses().values()) {
          ImmutableList.Builder<EigrpNeighborConfig> neighborsBuilder = ImmutableList.builder();
          for (Interface iface : config.getAllInterfaces(vrf.getName()).values()) {
            // if the interface does not belong to the current EIGRP process, skip it
            if (iface.getConcreteAddress() == null
                || iface.getEigrp() == null
                || !iface.getEigrp().getEnabled()
                || iface.getEigrp().getAsn() != proc.getAsn()) {
              continue;
            }
            // TODO: check if secondary addresses also participate in EIGRP neighbor relationships
            String exportPolicyName = iface.getEigrp().getExportPolicy();
            assert exportPolicyName != null; // VI conversion should ensure this
            neighborsBuilder.add(
                EigrpNeighborConfig.builder()
                    .setExportPolicy(exportPolicyName)
                    .setHostname(config.getHostname())
                    .setInterfaceName(iface.getName())
                    .setIp(iface.getConcreteAddress().getIp())
                    .setVrfName(vrf.getName())
                    .setAsn(iface.getEigrp().getAsn())
                    .setPassive(iface.getEigrp().getPassive())
                    .build());
          }
          proc.addNeighbors(neighborsBuilder.build());
        }
      }
    }
  }
