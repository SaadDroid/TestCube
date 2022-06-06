public PortfolioPermission permissionCheck(PortfolioNode node) {
    return _permissions.containsKey(node) ? _permissions.get(node) : DENY;
  }
