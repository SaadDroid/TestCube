public NumericProperty<Integer> locate(String string) {
        return PropertyFactory.createNumeric(
                FunctionExpressionFactory.locateExp(ExpressionFactory.wrapScalarValue(string), getExpression()),
                Integer.class
        );
    }
