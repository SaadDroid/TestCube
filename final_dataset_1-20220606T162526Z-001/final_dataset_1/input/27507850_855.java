@Override
  public boolean isAccessibleNetwork(String apiKey, String containerName, boolean logError) {
    Permissions allPerms = loadPermissions();
    boolean allowed = accessAllowed(apiKey, containerName, allPerms);
    if (!allowed && logError) {
      _logger.infof("Authorizer: %s is NOT allowed to access %s\n", apiKey, containerName);
    }
    return allowed;
  }
