public Collection<Service> addServices(Collection<Service> coll) {
    verifyHasUniqueId(Args.notNull(coll, "services"));
    return doAddServices(coll);
  }
