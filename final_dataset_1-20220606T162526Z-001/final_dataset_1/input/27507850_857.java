@Override
  public boolean isValidWorkApiKey(String apiKey) {
    Users allUsers = loadUsers();
    boolean validUser = allUsers.users.stream().anyMatch(u -> apiKey.equals(u.apikey));
    _logger.infof("Authorizer: %s is %s valid API key\n", apiKey, validUser ? "a" : "NOT a");
    return validUser;
  }
