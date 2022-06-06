@Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof LiteralCommunity)) {
      return false;
    }
    return _community.equals(((LiteralCommunity) obj)._community);
  }
