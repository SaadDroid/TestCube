@Override
  public boolean equals(@Nullable Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Pool)) {
      return false;
    }
    Pool rhs = (Pool) obj;
    return Objects.equals(_description, rhs._description)
        && _members.equals(rhs._members)
        && _monitors.equals(rhs._monitors)
        && _name.equals(rhs._name);
  }
