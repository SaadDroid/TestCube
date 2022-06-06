public static boolean isNegation(Tree tree) {
    return tree instanceof UnaryExpressionTree && ((UnaryExpressionTree) tree).operator() == UnaryExpressionTree.Operator.NEGATE;
  }
