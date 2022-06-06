public NumericProperty<E> avg() {
        return PropertyFactory.createNumeric(FunctionExpressionFactory.avgExp(getExpression()), getType());
    }
