@Nonnull
  @VisibleForTesting
  static Ip getRouterId(RoutingInstance routingInstance) {
    Ip routerId = routingInstance.getRouterId();
    if (routerId != null) {
      return routerId;
    }

    Map<String, Interface> allInterfaces = routingInstance.getInterfaces();
    Map<String, Interface> loopbackInterfaces =
        allInterfaces.entrySet().stream()
            .filter(e -> e.getKey().toLowerCase().startsWith("lo"))
            .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
    Map<String, Interface> routerIdCandidates =
        loopbackInterfaces.isEmpty() ? allInterfaces : loopbackInterfaces;

    return routerIdCandidates.values().stream()
        .filter(Interface::getActive)
        .map(Interface::getPrimaryAddress)
        .filter(Objects::nonNull)
        .map(ConcreteInterfaceAddress::getIp)
        .min(Comparator.naturalOrder())
        .orElse(Ip.ZERO);
  }
