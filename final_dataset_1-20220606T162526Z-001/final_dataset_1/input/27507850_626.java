@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Vpc)) {
      return false;
    }
    Vpc vpc = (Vpc) o;
    return Objects.equals(_cidrBlockAssociations, vpc._cidrBlockAssociations)
        && Objects.equals(_ownerId, vpc._ownerId)
        && Objects.equals(_tags, vpc._tags)
        && Objects.equals(_vpcId, vpc._vpcId);
  }
