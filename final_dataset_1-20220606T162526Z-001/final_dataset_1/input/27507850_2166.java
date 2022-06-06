@VisibleForTesting
  static void extractHsrp(Table<Ip, Integer, Set<Interface>> hsrpGroups, Interface i) {
    // collect hsrp info
    i.getHsrpGroups()
        .values()
        .forEach(
            g -> {
              Ip ip = g.getIp();
              int groupNum = g.getGroupNumber();
              if (ip == null) {
                return;
              }
              Set<Interface> candidates = hsrpGroups.get(ip, groupNum);
              if (candidates == null) {
                candidates = Collections.newSetFromMap(new IdentityHashMap<>());
                hsrpGroups.put(ip, groupNum, candidates);
              }
              candidates.add(i);
            });
  }
