@Nullable
  static AclLineMatchExpr dscpsToAclLineMatchExpr(@Nullable IntegerSpace dscps) {
    return Optional.ofNullable(dscps)
        .map(IntegerSpace::enumerate)
        .map(k -> match(HeaderSpace.builder().setDscps(k).build()))
        .orElse(null);
  }
