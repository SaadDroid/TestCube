@Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    } else if (!(obj instanceof ExplicitAsPathSet)) {
      return false;
    }
    ExplicitAsPathSet other = (ExplicitAsPathSet) obj;
    return _elems.equals(other._elems);
  }
