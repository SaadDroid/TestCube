public static Collection<InetSocketAddress> getSCMAddresses(
      ConfigurationSource conf) {
    Collection<String> names =
        conf.getTrimmedStringCollection(ScmConfigKeys.OZONE_SCM_NAMES);
    if (names.isEmpty()) {
      throw new IllegalArgumentException(ScmConfigKeys.OZONE_SCM_NAMES
          + " need to be a set of valid DNS names or IP addresses."
          + " Empty address list found.");
    }

    Collection<InetSocketAddress> addresses = new HashSet<>(names.size());
    for (String address : names) {
      Optional<String> hostname = getHostName(address);
      if (!hostname.isPresent()) {
        throw new IllegalArgumentException("Invalid hostname for SCM: "
            + address);
      }
      int port = getHostPort(address)
          .orElse(ScmConfigKeys.OZONE_SCM_DEFAULT_PORT);
      InetSocketAddress addr = NetUtils.createSocketAddr(hostname.get(), port);
      addresses.add(addr);
    }
    return addresses;
  }
