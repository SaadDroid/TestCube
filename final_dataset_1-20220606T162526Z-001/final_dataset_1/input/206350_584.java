public StringProperty<String> upper() {
        return PropertyFactory.createString(FunctionExpressionFactory.upperExp(getExpression()), String.class);
    }
