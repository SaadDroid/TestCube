public RuleOutput applySingle(HitPolicy hitPolicy) {
        if (hitPolicy == null) {
            hitPolicy = HitPolicy.UNIQUE;
        }
        if (hitPolicy == HitPolicy.UNIQUE) {
            if (this.matchedRuleResults.size() == 1) {
                return this.matchedRuleResults.get(0);
            } else {
                return null;
            }
        } else if (hitPolicy == HitPolicy.ANY) {
            if (this.matchedRuleResults.size() > 0) {
                Set<RuleOutput> distinctResults = new HashSet<>(this.matchedRuleResults);
                if (distinctResults.size() == 1) {
                    return distinctResults.iterator().next();
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } else if (hitPolicy == HitPolicy.FIRST) {
            if (this.matchedRuleResults.size() > 0) {
                return this.matchedRuleResults.get(0);
            } else {
                return null;
            }
        } else if (hitPolicy == HitPolicy.PRIORITY) {
            if (this.matchedRuleResults.size() > 0) {
                List<RuleOutput> sortedRuleOutputs = sort(this.matchedRuleResults);
                return sortedRuleOutputs.get(0);
            } else {
                return null;
            }
        } else {
            throw new UnsupportedOperationException(String.format("Not supported single hit policy %s.", hitPolicy.name()));
        }
    }
