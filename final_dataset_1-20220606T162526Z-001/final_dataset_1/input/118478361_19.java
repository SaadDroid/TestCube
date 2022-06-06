public List<? extends RuleOutput> applyMultiple(HitPolicy hitPolicy) {
        List<RuleOutput> matchedRuleOutputs = this.getMatchedRuleResults();
        if (hitPolicy == HitPolicy.COLLECT) {
            return matchedRuleOutputs;
        } else if (hitPolicy == HitPolicy.RULE_ORDER) {
            return matchedRuleOutputs;
        } else if (hitPolicy == HitPolicy.OUTPUT_ORDER) {
            return sort(matchedRuleOutputs);
        } else {
            throw new UnsupportedOperationException(String.format("Not supported multiple hit policy %s.", hitPolicy.name()));
        }
    }
