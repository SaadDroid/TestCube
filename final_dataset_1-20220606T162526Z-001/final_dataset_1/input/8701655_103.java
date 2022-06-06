@Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj.getClass() != getClass()) return false;

    BaseId otherId = (BaseId) obj;

    return Objects.equals(getId(), otherId.getId());
  }
