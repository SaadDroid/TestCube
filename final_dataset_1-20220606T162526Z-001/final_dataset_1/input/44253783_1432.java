@Override
  public PooledDataSource build(PluggableJdbcPooledConnection conn) throws Exception {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl(conn.getConnectUrl());
    config.setUsername(conn.getUsername());
    config.setPassword(Password.decode(ExternalResolver.resolve(conn.getPassword())));
    config.setDriverClassName(conn.getDriverImp());
    config.setDataSourceProperties(conn.connectionProperties());
    config.setAutoCommit(conn.autoCommit());
    // Call all the setters
    conn.poolProperties().stream().forEach((kvp) -> {
      SimpleBeanUtil.callSetter(config, "set" + kvp.getKey(), kvp.getValue());
    });
    return new HikariDataSourceWrapper(new HikariDataSource(config));
  }
