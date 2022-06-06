public static CConfiguration create() {
    // Create a new configuration instance, but do NOT initialize with
    // the Hadoop default properties.
    CConfiguration conf = new CConfiguration();
    conf.addResource("cdap-default.xml");
    conf.addResource("cdap-site.xml");
    return conf;
  }
