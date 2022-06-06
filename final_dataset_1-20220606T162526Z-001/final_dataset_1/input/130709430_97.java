public Object evaluate(String expressionString) {
        try {
            return expressionCache.computeIfAbsent(expressionString, this::parse).getValue(evaluationContext);
        } catch (EvaluationException e) {
            return expressionString;
        }
    }
