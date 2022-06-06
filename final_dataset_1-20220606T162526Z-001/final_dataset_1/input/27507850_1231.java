public OspfProcess.Builder ospfProcessBuilder() {
    return OspfProcess.builder(() -> generateName(OspfProcess.class)).setReferenceBandwidth(1e8);
  }
