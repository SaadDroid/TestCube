@Override
    public RuleResult verify(VerificationContext context) throws KSIException {
        return new NotRuleResult(rule, rule.verify(context));
    }
