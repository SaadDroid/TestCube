@Override
  public final Boolean visitAclIpSpace(AclIpSpace aclIpSpace) {
    for (AclIpSpaceLine line : aclIpSpace.getLines()) {
      if (line.getIpSpace().accept(this)) {
        return line.getAction() == LineAction.PERMIT;
      }
    }
    return false;
  }
