@Override
  public NormalizationRuleSet resolve(String ruleSetId) {
    ArgumentChecker.notNull(ruleSetId, "Rule set ID");
    
    for (NormalizationRuleSet normalizationRuleSet : _rules) {
      if (ruleSetId.equals(normalizationRuleSet.getId())) {
        return normalizationRuleSet;        
      } 
    }
    
    return null;
  }
