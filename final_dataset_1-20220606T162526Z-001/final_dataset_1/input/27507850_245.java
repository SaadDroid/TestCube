@VisibleForTesting
  long getIncrementalCost(String interfaceName, boolean considerP2PasStub) {
    Interface iface = _c.getAllInterfaces().get(interfaceName);
    assert iface != null;
    return getIncrementalCost(iface, considerP2PasStub);
  }
