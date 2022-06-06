@Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof IcmpTypesApplication)) {
      return false;
    }
    IcmpTypesApplication that = (IcmpTypesApplication) o;
    return _types.equals(that._types);
  }
