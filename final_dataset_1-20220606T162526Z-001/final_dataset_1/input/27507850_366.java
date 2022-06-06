@VisibleForTesting
  IsisLevel processIsisInterfaceSettings(
      RoutingInstance routingInstance, boolean level1, boolean level2) {
    return _c.getAllInterfaces(routingInstance.getName()).entrySet().stream()
        .map(
            e -> {
              String ifaceName = e.getKey();
              org.batfish.datamodel.Interface newIface = e.getValue();
              org.batfish.datamodel.isis.IsisInterfaceSettings settings =
                  toIsisInterfaceSettings(
                      routingInstance.getIsisSettings(),
                      routingInstance.getInterfaces().get(ifaceName),
                      level1,
                      level2,
                      newIface.isLoopback());
              newIface.setIsis(settings);
              if (settings == null || newIface.isLoopback()) {
                return null;
              }
              return settings.getEnabledLevels();
            })
        .filter(Objects::nonNull)
        .reduce(IsisLevel::union) // will not return null as long as parameters are not null
        .orElse(null);
  }
