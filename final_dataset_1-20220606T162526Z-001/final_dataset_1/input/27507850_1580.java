@Override
  public boolean equals(@Nullable Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof CommunitySetUnion)) {
      return false;
    }
    CommunitySetUnion rhs = (CommunitySetUnion) obj;
    return _exprs.equals(rhs._exprs);
  }
