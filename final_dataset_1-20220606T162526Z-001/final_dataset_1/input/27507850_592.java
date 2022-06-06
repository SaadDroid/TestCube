@VisibleForTesting
  static int toOspfHelloInterval(OspfInterface ospf) {
    Integer helloInterval = ospf.getHelloIntervalS();
    if (helloInterval != null) {
      return helloInterval;
    }
    return DEFAULT_HELLO_INTERVAL_S;
  }
