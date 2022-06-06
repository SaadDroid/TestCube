public boolean containsVariable(final String name) {
        return FeelExpressions.caseOf(this)
                .Empty_(false)
                .Null_(false)
                .BooleanLiteral_(false)
                .DateLiteral_(false)
                .DoubleLiteral_(false)
                .IntegerLiteral_(false)
                .StringLiteral_(false)
                .VariableLiteral(variableName -> variableName.equals(name))
                .RangeExpression((__, lowerBound, upperBound, ___) -> lowerBound.containsVariable(name) || upperBound.containsVariable(name))
                .UnaryExpression((__, expression) -> expression.containsVariable(name))
                .BinaryExpression((left, __, right) -> left.containsVariable(name) || right.containsVariable(name))
                .DisjunctionExpression((head, tail) -> head.containsVariable(name) || tail.containsVariable(name));
    }
