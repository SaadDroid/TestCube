public static List<ManagementComponentInfo> create(final BootstrapProperties p) throws Exception {
    if (!INSTANCE.getManagementComponents().containsKey(p)) {
      List<ManagementComponentInfo> manCompInfo = INSTANCE.createComponents(p);
      INSTANCE.getManagementComponents().put(p,manCompInfo );
    }
    return INSTANCE.getManagementComponents().get(p);
  }
