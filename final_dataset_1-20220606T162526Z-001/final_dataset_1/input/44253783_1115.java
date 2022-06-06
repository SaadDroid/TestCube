@Override
  public Collection<ObjectName> getChildren() throws MalformedObjectNameException {
    Set<ObjectName> result = new TreeSet<ObjectName>();
    for (ChannelRuntimeManager cmb : channelManagers) {
      result.add(cmb.createObjectName());
    }
    return result;
  }
