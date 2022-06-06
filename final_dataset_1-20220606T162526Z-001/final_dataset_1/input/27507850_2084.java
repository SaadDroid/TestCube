@VisibleForTesting
  void verifyCommunitySetMatchExprs() {
    _ctx._communitySetMatchExprs.values().stream()
        .forEach(e -> e.accept(COMMUNITY_SET_MATCH_EXPR_VERIFIER, _ctx));
  }
