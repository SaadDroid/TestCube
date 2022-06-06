@Override
  public void checkPermission(PrincipalCollection subjectPrincipal, String requiredPermission) throws AuthorizationException {
    Permission required = getPermissionResolver().resolvePermission(requiredPermission);
    checkPermission(subjectPrincipal, required);
  }
