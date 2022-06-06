public String replacePortTokens(String value) {
    BiMap<String, Optional<Integer>> portMappings = HashBiMap.create();
    Matcher regexMatcher = PORT_REGEX.matcher(value);
    while (regexMatcher.find()) {
      String token = regexMatcher.group(0);
      if (!portMappings.containsKey(token)) {
        Optional<Integer> portStart = Optional.absent();
        Optional<Integer> portEnd = Optional.absent();
        String unboundedStart = regexMatcher.group(1);
        if (unboundedStart != null) {
          int requestedEndPort = Integer.parseInt(unboundedStart);
          Preconditions.checkArgument(requestedEndPort <= PortUtils.MAXIMUM_PORT);
          portEnd = Optional.of(requestedEndPort);
        } else {
          String unboundedEnd = regexMatcher.group(2);
          if (unboundedEnd != null) {
            int requestedStartPort = Integer.parseInt(unboundedEnd);
            Preconditions.checkArgument(requestedStartPort >= PortUtils.MINIMUM_PORT);
            portStart = Optional.of(requestedStartPort);
          } else {
            String absolute = regexMatcher.group(3);
            if (!"?".equals(absolute)) {
              int requestedPort = Integer.parseInt(absolute);
              Preconditions.checkArgument(requestedPort >= PortUtils.MINIMUM_PORT &&
                      requestedPort <= PortUtils.MAXIMUM_PORT);
              portStart = Optional.of(requestedPort);
              portEnd = Optional.of(requestedPort);
            }
          }
        }
        Optional<Integer> port = takePort(portStart, portEnd);
        portMappings.put(token, port);
      }
    }
    for (Map.Entry<String, Optional<Integer>> port : portMappings.entrySet()) {
      if (port.getValue().isPresent()) {
        value = value.replace(port.getKey(), port.getValue().get().toString());
      }
    }
    return value;
  }
