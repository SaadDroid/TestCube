protected List<ServerName> generateDeadServersListToSend() {
    // We're getting the message sent since last time, and add them to the list
    long since = EnvironmentEdgeManager.currentTimeMillis() - messagePeriod * 2;
    for (Pair<ServerName, Long> dead : getDeadServers(since)) {
      lastSent.putIfAbsent(dead.getFirst(), 0);
    }

    // We're sending the new deads first.
    List<Map.Entry<ServerName, Integer>> entries = new ArrayList<Map.Entry<ServerName, Integer>>();
    entries.addAll(lastSent.entrySet());
    Collections.sort(entries, new Comparator<Map.Entry<ServerName, Integer>>() {
      @Override
      public int compare(Map.Entry<ServerName, Integer> o1, Map.Entry<ServerName, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    });

    // With a limit of MAX_SERVER_PER_MESSAGE
    int max = entries.size() > MAX_SERVER_PER_MESSAGE ? MAX_SERVER_PER_MESSAGE : entries.size();
    List<ServerName> res = new ArrayList<ServerName>(max);

    for (int i = 0; i < max; i++) {
      Map.Entry<ServerName, Integer> toSend = entries.get(i);
      if (toSend.getValue() >= (NB_SEND - 1)) {
        lastSent.remove(toSend.getKey());
      } else {
        lastSent.replace(toSend.getKey(), toSend.getValue(), toSend.getValue() + 1);
      }

      res.add(toSend.getKey());
    }

    return res;
  }
