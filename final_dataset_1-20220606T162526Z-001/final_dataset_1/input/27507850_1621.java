@Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof RouteTargetExtendedCommunityExpr)) {
      return false;
    }
    RouteTargetExtendedCommunityExpr rhs = (RouteTargetExtendedCommunityExpr) obj;
    return _gaExpr.equals(rhs._gaExpr) && _laExpr.equals(rhs._laExpr);
  }
