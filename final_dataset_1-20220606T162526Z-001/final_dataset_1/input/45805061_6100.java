@Override
  public boolean checkImplies(Permission requiredPermission) {
    if (requiredPermission instanceof ProviderBasedPermission == false) {
      return false;
    }
    ProviderBasedPermission requiredPerm = (ProviderBasedPermission) requiredPermission;
    UserPrincipals user = (UserPrincipals) AuthUtils.getSubject().getSession().getAttribute(UserPrincipals.ATTRIBUTE_KEY);
    if (user == null) {
      throw new UnauthenticatedException("Permission denied: User not logged in: " + requiredPermission);
    }
    PermissionCheckProviderRequest request = PermissionCheckProviderRequest.createGet(
        user.getAlternateIds(), user.getNetworkAddress(), requiredPerm.getPermissionString());
    PermissionCheckProviderResult result = _provider.isPermitted(request);
    result.checkErrors();
    return result.isPermitted(requiredPerm.getPermissionString());
  }
