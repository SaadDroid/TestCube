public CLIConnectionConfig parse(String uriString) {
    uriString = addScheme(uriString);

    URI uri = URI.create(uriString);
    NamespaceId namespace =
      (uri.getPath() == null || uri.getPath().isEmpty() || "/".equals(uri.getPath())) ?
      NamespaceId.DEFAULT : new NamespaceId(uri.getPath().substring(1));
    String hostname = uri.getHost();
    boolean sslEnabled = "https".equals(uri.getScheme());
    int port = uri.getPort();

    if (port == -1) {
      port = sslEnabled ?
        cConf.getInt(Constants.Router.ROUTER_SSL_PORT) :
        cConf.getInt(Constants.Router.ROUTER_PORT);
    }

    ConnectionConfig config = ConnectionConfig.builder()
      .setHostname(hostname)
      .setPort(port)
      .setSSLEnabled(sslEnabled)
      .build();
    return new CLIConnectionConfig(config, namespace, null);
  }
