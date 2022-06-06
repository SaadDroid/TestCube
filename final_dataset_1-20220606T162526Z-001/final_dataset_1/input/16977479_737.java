@Override
    public SearchCondition<T> parse(String fiqlExpression) throws SearchParseException {
        ASTNode<T> ast = parseAndsOrsBrackets(fiqlExpression);
        return ast.build();
    }
