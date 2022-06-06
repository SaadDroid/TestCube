@Override
  public boolean equals(@Nullable Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof MatchProtocol)) {
      return false;
    }
    MatchProtocol that = (MatchProtocol) o;
    return _protocols.equals(that._protocols);
  }
