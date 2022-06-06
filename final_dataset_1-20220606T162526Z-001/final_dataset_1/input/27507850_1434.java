public static NodeInterfacePair of(String hostname, String interfaceName) {
    return CACHE.getUnchecked(new NodeInterfacePair(hostname, interfaceName));
  }
