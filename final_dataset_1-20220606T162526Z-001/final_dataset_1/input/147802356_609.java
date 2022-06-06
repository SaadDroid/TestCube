@Override
  public Database createDatabase() {
    LOG.info("Data directory set to: {}", dataDirectory.getAbsolutePath());
    validateDataPaths();
    final DatabaseVersion dbVersion = getDatabaseVersion();
    createDirectories();
    saveDatabaseVersion(dbVersion);

    Database database;
    switch (dbVersion) {
      case NOOP:
        database = new NoOpDatabase();
        LOG.trace("Created no-op database");
        break;
      case V3:
        database = createV3Database();
        LOG.trace(
            "Created V3 database ({}) at {}", dbVersion.getValue(), dbDirectory.getAbsolutePath());
        break;
      case V4:
        database = createV4Database();
        LOG.trace(
            "Created V4 Hot database ({}) at {}",
            dbVersion.getValue(),
            dbDirectory.getAbsolutePath());
        LOG.trace(
            "Created V4 Finalized database ({}) at {}",
            dbVersion.getValue(),
            archiveDirectory.getAbsolutePath());
        break;
      case V5:
        database = createV5Database();
        LOG.trace(
            "Created V5 Hot database ({}) at {}",
            dbVersion.getValue(),
            dbDirectory.getAbsolutePath());
        LOG.trace(
            "Created V5 Finalized database ({}) at {}",
            dbVersion.getValue(),
            archiveDirectory.getAbsolutePath());
        break;
      default:
        throw new UnsupportedOperationException("Unhandled database version " + dbVersion);
    }
    return database;
  }
