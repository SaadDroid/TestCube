@Override
  public BDD visit(IpSpace ipSpace) {
    return _cache.getUnchecked(ipSpace);
  }
