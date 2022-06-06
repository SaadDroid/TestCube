public NumericProperty<E> max() {
        return PropertyFactory.createNumeric(FunctionExpressionFactory.maxExp(getExpression()), getType());
    }
