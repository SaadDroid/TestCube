@Override
    public List<String> validate(DMNModelRepository dmnModelRepository) {
        List<String> errors = new ArrayList<>();

        if (dmnModelRepository == null) {
            throw new IllegalArgumentException("Missing definitions");
        }

        for (TDefinitions definitions: dmnModelRepository.getAllDefinitions()) {
            for (TDecision decision : dmnModelRepository.findDecisions(definitions)) {
                TExpression expression = dmnModelRepository.expression(decision);
                if (expression instanceof TDecisionTable) {
                    List<TDecisionRule> rules = ((TDecisionTable) expression).getRule();
                    for (int i = 0; i < rules.size(); i++) {
                        TDecisionRule rule = rules.get(i);
                        validate(rule.getDescription(), i, decision, errors);
                    }
                }
            }
        }

        return errors;
    }
