@Override
  public IpSpace visitAclIpSpace(AclIpSpace aclIpSpace)
      throws CircularReferenceException, UndefinedReferenceException {
    AclIpSpace.Builder sanitizedSpace = AclIpSpace.builder();
    for (AclIpSpaceLine line : aclIpSpace.getLines()) {
      IpSpace ipSpace = line.getIpSpace().accept(this);
      sanitizedSpace.thenAction(line.getAction(), ipSpace);
    }
    // No cycles/undefined references in this AclIpSpace. Return reference-free version.
    return sanitizedSpace.build();
  }
