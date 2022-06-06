public Expression contains(V value) {
        return ExpressionFactory.matchExp(getExpression(), value);
    }
