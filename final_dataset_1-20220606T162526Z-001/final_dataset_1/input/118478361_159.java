boolean isSparseDecisionTable(TDecisionTable expression, double sparsityThreshold) {
        int columnNo = expression.getInput().size();
        int lineNo = expression.getRule().size();
        int anyMatchCount = 0;
        for(TDecisionRule rule: expression.getRule()) {
            for(TUnaryTests test : rule.getInputEntry()) {
                if ("-".equals(test.getText())) {
                    anyMatchCount++;
                }
            }
        }
        double sparsity = 1.0 * anyMatchCount / (lineNo * columnNo);
        return sparsity >= sparsityThreshold;
    }
