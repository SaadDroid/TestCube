public Map<String, Vxlan> convertVxlans() {
    return _interfaces.getInterfaces().values().stream()
        .filter(InterfaceConverter::isVxlan)
        .map(InterfaceConverter::convertVxlan)
        .collect(toImmutableMap(Vxlan::getName, Function.identity()));
  }
