@Override
  public void set(File file, String view, String attribute, Object value, boolean create) {
    if (attribute.equals("owner")) {
      checkNotCreate(view, attribute, create);
      UserPrincipal user = checkType(view, attribute, value, UserPrincipal.class);
      // TODO(cgdecker): Do we really need to do this? Any reason not to allow any UserPrincipal?
      if (!(user instanceof UserLookupService.JimfsUserPrincipal)) {
        user = createUserPrincipal(user.getName());
      }
      file.setAttribute("owner", "owner", user);
    }
  }
