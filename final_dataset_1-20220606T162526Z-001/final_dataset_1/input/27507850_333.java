@VisibleForTesting
  static NatRule reverseRule(NatRule rule) {
    NatRule reversedRule = new NatRule(rule.getName());
    List<NatRuleMatch> matchList = rule.getMatches();
    matchList.forEach(
        match -> {
          NatRuleMatch reversedDstMatch = reverseMatchToMatch(match);
          NatRuleThen reversedThen = reverseMatchToThen(match);
          if (reversedDstMatch != null) {
            reversedRule.getMatches().add(reversedDstMatch);
          }
          if (reversedThen != null) {
            // only one dst-match is allowed, so just set the then
            assert reversedRule.getThen() == null;
            reversedRule.setThen(reversedThen);
          }
        });
    reversedRule.getMatches().add(thenToMatch(rule.getThen()));
    return reversedRule;
  }
