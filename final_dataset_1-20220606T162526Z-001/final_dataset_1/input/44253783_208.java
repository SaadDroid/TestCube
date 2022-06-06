@Override
  public boolean validate(IdentityBuilder builder, AdaptrisMessage msg) {
    boolean result = false;
    try {
      Map<String, Object> identity = builder.build(msg);
      
      Map<String, AccessCredentials> myUsers = loadUsers();
      String username = (String) identity.get(KEY_USERNAME);
      if (myUsers.containsKey(username)) {
        result = myUsers.get(username).validate((String) identity.get(KEY_PASSWORD), (String) identity.get(KEY_ROLE));
      }
    }
    catch (Exception e) {
      result = false;
    }
    return result;
  }
