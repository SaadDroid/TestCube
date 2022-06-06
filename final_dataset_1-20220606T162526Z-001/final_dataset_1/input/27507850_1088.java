@Override
  public IpSpace apply(@Nonnull IpSpace ipSpace) {
    return _visitor.visit(ipSpace);
  }
